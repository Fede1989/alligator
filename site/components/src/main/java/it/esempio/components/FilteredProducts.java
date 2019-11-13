package it.esempio.components;

import it.esempio.beans.Product;
import it.esempio.components.infos.FilteredProductInfo;
import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.HstQueryResult;
import org.hippoecm.hst.content.beans.query.builder.HstQueryBuilder;
import org.hippoecm.hst.content.beans.query.exceptions.QueryException;

import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.content.beans.standard.HippoBeanIterator;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.onehippo.cms7.essentials.components.CommonComponent;


import java.util.ArrayList;

@ParametersInfo(type = FilteredProductInfo.class)
public class FilteredProducts extends CommonComponent {
    @Override
    public void doBeforeRender(HstRequest request, HstResponse response) {
        super.doBeforeRender(request, response);

        HstRequestContext requestContext = request.getRequestContext();
        FilteredProductInfo info = getComponentParametersInfo(request);

        HippoBean scope = requestContext.getSiteContentBaseBean();


        ArrayList<Product> products = new ArrayList<>();
        try {
            //creo una query
            HstQuery hstQuery = HstQueryBuilder.create(scope).ofTypes(Product.class)
                   /* .orderByAscending("alligator:title")*/
                    .orderByDescending(("alligator:price"))
                    .build();


            //eseguo la query
            HstQueryResult result = hstQuery.execute();

            //ricavo un iterator
            HippoBeanIterator iterator = result.getHippoBeans();


            while (iterator.hasNext()) {
                products.add((Product) iterator.nextHippoBean());
            }

        } catch (QueryException e) {
            throw new HstComponentException(
                    "Exception occured during creation or execution of HstQuery.", e);
        }

        //setto nella variabile products la lista di prodotti trovati dalla query
        request.setAttribute("products", products);


    }

}

