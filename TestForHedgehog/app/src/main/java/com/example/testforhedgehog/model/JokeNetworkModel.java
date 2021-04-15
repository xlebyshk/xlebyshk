package com.example.testforhedgehog.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JokeNetworkModel {
    @SerializedName("id")
    @Expose
    public int id;

    @SerializedName("joke")
    @Expose
    public String joke;

    @SerializedName("categories")
    @Expose
    public List<Object> categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }
}
