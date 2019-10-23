package com.example.kittens.model;

public class ListItem {

    private String imageUrl;
    private String creator;
    private int numOfLikes;

    public ListItem(String imageUrl, String creator, int numOfLikes) {
        this.imageUrl = imageUrl;
        this.creator = creator;
        this.numOfLikes = numOfLikes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getNumOfLikes() {
        return numOfLikes;
    }

    public void setNumOfLikes(int numOfLikes) {
        this.numOfLikes = numOfLikes;
    }
}
