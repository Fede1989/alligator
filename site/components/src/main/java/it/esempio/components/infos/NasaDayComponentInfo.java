package it.esempio.components.infos;

import org.hippoecm.hst.core.parameters.Parameter;

import java.util.Date;

public interface NasaDayComponentInfo {
    @Parameter(name = "image", defaultValue = "", displayName = "low resolution image")
    Boolean isHd();

    @Parameter(name="date", defaultValue = "", displayName = "date", required = true)
    Date getDate();
}
