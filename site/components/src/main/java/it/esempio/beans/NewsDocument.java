package it.esempio.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

import java.util.List;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "alligator:newsdocument")
@Node(jcrType = "alligator:newsdocument")
public class NewsDocument extends HippoDocument {
    /** 
     * The document type of the news document.
     */
    public static final String DOCUMENT_TYPE = "alligator:newsdocument";
    private static final String TITLE = "alligator:title";
    private static final String DATE = "alligator:date";
    private static final String INTRODUCTION = "alligator:introduction";
    private static final String IMAGE = "alligator:image";
    private static final String CONTENT = "alligator:content";
    private static final String LOCATION = "alligator:location";
    private static final String AUTHOR = "alligator:author";
    private static final String SOURCE = "alligator:source";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "alligator:title")
    public String getTitle() {
        return getSingleProperty(TITLE);
    }

    /** 
     * Get the date of the document.
     * @return the date
     */
    @HippoEssentialsGenerated(internalName = "alligator:date")
    public Calendar getDate() {
        return getSingleProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "alligator:introduction")
    public String getIntroduction() {
        return getSingleProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "alligator:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "alligator:location")
    public String getLocation() {
        return getSingleProperty(LOCATION);
    }

    /** 
     * Get the author of the document.
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "alligator:author")
    public String getAuthor() {
        return getSingleProperty(AUTHOR);
    }

    /** 
     * Get the source of the document.
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "alligator:source")
    public String getSource() {
        return getSingleProperty(SOURCE);
    }

    @HippoEssentialsGenerated(internalName = "alligator:image")
    public Setimmagini getImage() {
        return getLinkedBean("alligator:image", Setimmagini.class);
    }

    @HippoEssentialsGenerated(internalName = "alligator:relatednews")
    public List<HippoBean> getRelatednews() {
        return getLinkedBeans("alligator:relatednews", HippoBean.class);
    }
}
