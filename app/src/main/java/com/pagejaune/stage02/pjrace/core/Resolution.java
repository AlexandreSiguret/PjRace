package com.pagejaune.stage02.pjrace.core;

/**
 * Created by stage02 on 03/02/17.
 */

public class Resolution {
    private int id;
    private String picture_Url;

    public Resolution(){}

    public Resolution(int id, String picture_Url) {
        this.id = id;
        this.picture_Url = picture_Url;
    }

    public String getPicture_Url() {
        return picture_Url;
    }

    public void setPicture_Url(String picture_Url) {
        this.picture_Url = picture_Url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

