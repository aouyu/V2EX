package com.aouyu.apps.v2ex.bean;

/**
 * Created by fangxiaotian on 2017/2/24.
 */

public class Node {

    /**
     * id : 300
     * name : programmer
     * title : 程序员
     * title_alternative : Programmer
     * url : http://www.v2ex.com/go/programmer
     * topics : 14833
     * avatar_mini : //v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_mini.png?m=1487383515
     * avatar_normal : //v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_normal.png?m=1487383515
     * avatar_large : //v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_large.png?m=1487383515
     */

    private int id;
    private String name;
    private String title;
    private String title_alternative;
    private String url;
    private int topics;
    private String avatar_mini;
    private String avatar_normal;
    private String avatar_large;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_alternative() {
        return title_alternative;
    }

    public void setTitle_alternative(String title_alternative) {
        this.title_alternative = title_alternative;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTopics() {
        return topics;
    }

    public void setTopics(int topics) {
        this.topics = topics;
    }

    public String getAvatar_mini() {
        return avatar_mini;
    }

    public void setAvatar_mini(String avatar_mini) {
        this.avatar_mini = avatar_mini;
    }

    public String getAvatar_normal() {
        return avatar_normal;
    }

    public void setAvatar_normal(String avatar_normal) {
        this.avatar_normal = avatar_normal;
    }

    public String getAvatar_large() {
        return avatar_large;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", title_alternative='" + title_alternative + '\'' +
                ", url='" + url + '\'' +
                ", topics=" + topics +
                ", avatar_mini='" + avatar_mini + '\'' +
                ", avatar_normal='" + avatar_normal + '\'' +
                ", avatar_large='" + avatar_large + '\'' +
                '}';
    }
}
