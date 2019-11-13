package it.esempio.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "alligator:bannerdocument")
@Node(jcrType = "alligator:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "alligator:title")
    public String getTitle() {
        return getSingleProperty("alligator:title");
    }

    @HippoEssentialsGenerated(internalName = "alligator:content")
    public HippoHtml getContent() {
        return getHippoHtml("alligator:content");
    }

    @HippoEssentialsGenerated(internalName = "alligator:link")
    public HippoBean getLink() {
        return getLinkedBean("alligator:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:image")
    public Setimmagini getImage() {
        return getLinkedBean("alligator:image", Setimmagini.class);
    }
}
