package com.aouyu.apps.v2ex.bean;

/**
 * Created by fangxiaotian on 2017/2/24.
 */

public class Member {

    /**
     * id : 47978
     * username : phithon
     * tagline : 一个想当文人的黑客~
     * avatar_mini : //v2ex.assets.uxengine.net/avatar/2bc0/b213/47978_mini.png?m=1463760002
     * avatar_normal : //v2ex.assets.uxengine.net/avatar/2bc0/b213/47978_normal.png?m=1463760002
     * avatar_large : //v2ex.assets.uxengine.net/avatar/2bc0/b213/47978_large.png?m=1463760002
     */

    private int id;
    private String username;
    private String tagline;
    private String avatar_mini;
    private String avatar_normal;
    private String avatar_large;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
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
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", tagline='" + tagline + '\'' +
                ", avatar_mini='" + avatar_mini + '\'' +
                ", avatar_normal='" + avatar_normal + '\'' +
                ", avatar_large='" + avatar_large + '\'' +
                '}';
    }
}
