package com.project.assignment3;

public class Item {
    private String name;
    private int img_url;
    private String link;
    private String api;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg_url() {
        return img_url;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public void setImg_url(int img_url) {
        this.img_url = img_url;
    }

    public Item(String n, int i, String link, String api) {
        this.name = n;
        this.img_url = i;
        this.link = link;
        this.api = api;
    }

}
