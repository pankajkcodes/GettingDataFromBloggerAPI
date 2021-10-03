package com.pankajkcodes.bloggerapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemModel {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @Expose
    private String published;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("selfLink")
    @Expose
    private String selfLink;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;

    @Expose
    private String etag;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

}
