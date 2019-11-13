package it.esempio.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import java.util.List;

@HippoEssentialsGenerated(internalName = "alligator:product")
@Node(jcrType = "alligator:product")
public class Product extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "alligator:title")
    public String getTitle() {
        return getSingleProperty("alligator:title");
    }

    @HippoEssentialsGenerated(internalName = "alligator:price")
    public Double getPrice() {
        return getSingleProperty("alligator:price");
    }

    @HippoEssentialsGenerated(internalName = "alligator:introduction")
    public String getIntroduction() {
        return getSingleProperty("alligator:introduction");
    }

    @HippoEssentialsGenerated(internalName = "alligator:description")
    public HippoHtml getDescription() {
        return getHippoHtml("alligator:description");
    }

    @HippoEssentialsGenerated(internalName = "alligator:images")
    public List<Setimmagini> getImages() {
        return getLinkedBeans("alligator:images", Setimmagini.class);
    }
}
