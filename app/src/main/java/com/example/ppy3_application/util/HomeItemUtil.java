package com.example.ppy3_application.util;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


import androidx.appcompat.view.menu.MenuBuilder;

import com.example.ppy3_application.model.HomeItemModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import androidx.appcompat.view.menu.MenuBuilder;

public class HomeItemUtil {

    public static List<HomeItemModel> loadHomeItem(Context context ,int menuRes){
        List<HomeItemModel> list = new ArrayList<>();

        Menu menu = new MenuBuilder(context);
        MenuInflater inflater = new MenuInflater(context);

        inflater.inflate(menuRes,menu);

        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            list.add(new HomeItemModel(
                    item.getItemId(),
                    item.getIcon() != null ? getDrawableResId(item) : 0,
                    item.getTitle().toString()
            ));
        }
        return list;
    }

    private static int getDrawableResId(MenuItem item) {
        try {
            return (Integer) item.getIcon().getConstantState().getClass()
                    .getDeclaredField("mResId").get(item.getIcon().getConstantState());
        } catch (Exception e) {
            return 0;
        }

    }

}
