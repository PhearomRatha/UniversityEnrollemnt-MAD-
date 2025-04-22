package com.example.ppy3_application.model;

import java.util.UUID;

public class HomeItemModel {
    public int id;
    public int iconRes;

    public String title;

    public int getId() {
        return id;
    }

    public int getIcon() {
        return iconRes;
    }

    public String getTitle() {
        return title;
    }

    public HomeItemModel(int id, int icon, String title ){
        this.id = id;
        this.iconRes = icon;
        this.title = title;
    }


}
