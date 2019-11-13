package it.esempio.components.infos;

import org.hippoecm.hst.core.parameters.Parameter;

public interface FilteredProductInfo {
    @Parameter(name="limit", defaultValue = "3",displayName = "limit filtered")
    int getLimit();

    @Parameter(name="title", displayName = "limit")
    String getTitle();

}
