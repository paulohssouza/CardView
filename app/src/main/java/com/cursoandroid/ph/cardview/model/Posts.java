package com.cursoandroid.ph.cardview.model;

public class Posts {
    private String user, date, post;
    private int imagePost;

    public Posts() {

    }

    public Posts(String user, String date, String post, int imagePost) {
        this.user = user;
        this.date = date;
        this.post = post;
        this.imagePost = imagePost;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getImagePost() {
        return imagePost;
    }

    public void setImagePost(int imagePost) {
        this.imagePost = imagePost;
    }
}
