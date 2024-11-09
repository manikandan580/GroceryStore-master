package com.quintus.labs.grocerystore.model;

/**
 * Grocery App
 * https://github.com/manikandan580/GroceryStore
 * Created on 9-Nov-2024.
 * Created by : Manikandan.G:- http://manikandan.g132003.gmail.com
 */
public class Category {
    String id;
    String title;
    String image;

    public Category() {
    }

    public Category(String id, String title, String image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
