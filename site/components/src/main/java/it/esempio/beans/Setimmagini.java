package it.esempio.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "alligator:setimmagini")
@Node(jcrType = "alligator:setimmagini")
public class Setimmagini extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "alligator:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("alligator:small", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:large")
    public HippoGalleryImageBean getLarge() {
        return getBean("alligator:large", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:smallsquare")
    public HippoGalleryImageBean getSmallsquare() {
        return getBean("alligator:smallsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:mediumsquare")
    public HippoGalleryImageBean getMediumsquare() {
        return getBean("alligator:mediumsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:largesquare")
    public HippoGalleryImageBean getLargesquare() {
        return getBean("alligator:largesquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("alligator:banner", HippoGalleryImageBean.class);
    }
}
