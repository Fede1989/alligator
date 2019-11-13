package it.esempio.utils;

import com.google.common.base.Strings;
import it.esempio.models.NasaDayImage;
import org.hippoecm.hst.site.HstServices;
import org.onehippo.cms7.crisp.api.broker.ResourceServiceBroker;
import org.onehippo.cms7.crisp.api.resource.Resource;
import org.onehippo.cms7.crisp.hst.module.CrispHstServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NasaUtils {
    public static NasaDayImage getNasaDay(String requestDate ){
        String urlPath= "planetary/apod?api_key=DEMO_KEY";

        if (!Strings.isNullOrEmpty(requestDate) ){
            urlPath+= "&date="+requestDate;
        }

        ResourceServiceBroker broker = CrispHstServices.getDefaultResourceServiceBroker(HstServices.getComponentManager());
        Resource nasaDay = broker.findResources("placeholder",urlPath);

        String dateStr= (String) nasaDay.getValueMap().get("date");
        String description= (String) nasaDay.getValueMap().get("explanation");
        String title= (String) nasaDay.getValueMap().get("title");
        String hdImage= (String) nasaDay.getValueMap().get("hdurl");
        String image= (String) nasaDay.getValueMap().get("url");
        Date date=null;

        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            date = format.parse(dateStr);
        } catch (ParseException e) {
            System.out.println(e);
        }


        NasaDayImage nasaDayImage=new NasaDayImage(date,description,title,hdImage,image);
        return nasaDayImage;
    }
}
