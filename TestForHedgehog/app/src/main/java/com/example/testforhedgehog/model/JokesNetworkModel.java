package com.example.testforhedgehog.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JokesNetworkModel {
    @SerializedName("type")
    @Expose
    public String status;

    @SerializedName("value")
    @Expose
    public List<JokeNetworkModel> jokes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<JokeNetworkModel> getJokes() {
        return jokes;
    }

    public void setJokes(List<JokeNetworkModel> jokes) {
        this.jokes = jokes;
    }
}
