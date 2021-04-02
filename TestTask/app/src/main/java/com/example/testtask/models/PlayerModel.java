package com.example.testtask.models;

import android.widget.ImageView;

public class PlayerModel {
    private int avatar;
    private String name;
    private String sport;

    public PlayerModel(int avatar, String name, String sport) {
        this.avatar = avatar;
        this.name = name;
        this.sport = sport;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }
}
