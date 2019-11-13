package it.esempio.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;

@HippoEssentialsGenerated(internalName = "alligator:Filtered")
@Node(jcrType = "alligator:Filtered")
public class Filtered extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "alligator:price")
    public Double getPrice() {
        return getSingleProperty("alligator:price");
    }

    @HippoEssentialsGenerated(internalName = "alligator:title")
    public String getTitle() {
        return getSingleProperty("alligator:title");
    }
}
