package com.quintus.labs.grocerystore.model;

/**
 * Grocery App
 * https://github.com/manikandan580/GroceryStore
 * Created on 9-Nov-2024.
 * Created by : Manikandan.G:- http://manikandan.g132003.gmail.com
 */
public class Offer {
    String image;

    public Offer(String image) {
        this.image = image;
    }

    public Offer() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
