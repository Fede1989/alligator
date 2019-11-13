package it.esempio.components;

import it.esempio.components.infos.NasaDayComponentInfo;
import it.esempio.models.NasaDayImage;
import it.esempio.utils.NasaUtils;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ParametersInfo(type = NasaDayComponentInfo.class)
public class NasaDayComponent extends BaseHstComponent {
    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) throws HstComponentException {

        NasaDayComponentInfo info = getComponentParametersInfo(request);
        Date testDate = info.getDate();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(testDate);

        NasaDayImage nasaToday = NasaUtils.getNasaDay(strDate);
        request.setAttribute("nasaToday", nasaToday);
        Boolean isHd =info.isHd();
        request.setAttribute("isHd", isHd);

    }
}
