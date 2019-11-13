package it.esempio.models;

import java.util.Date;

public class NasaDayImage {
    private Date date;
    private String description;
    private String title;
    private String image;
    private String hdImage;

    public NasaDayImage(Date date, String description, String title, String image, String hdImage) {
        this.date = date;
        this.description = description;
        this.title = title;
        this.image = image;
        this.hdImage = hdImage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHdImage() {
        return hdImage;
    }

    public void setHdImage(String hdImage) {
        this.hdImage = hdImage;
    }
}
