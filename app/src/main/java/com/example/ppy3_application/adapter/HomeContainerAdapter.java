package com.example.ppy3_application.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ppy3_application.databinding.ItemMenuBinding;
import com.example.ppy3_application.model.HomeItemModel;

import java.util.ArrayList;
import java.util.List;

public class HomeContainerAdapter extends RecyclerView.Adapter<HomeContainerAdapter.HomeViewHolder> {

    private List<HomeItemModel> homeItemModels;

    public HomeContainerAdapter(){
        this.homeItemModels =new ArrayList<>();

    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        ItemMenuBinding binding = ItemMenuBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new HomeViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeContainerAdapter.HomeViewHolder homeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        protected ItemMenuBinding binding;

        public HomeViewHolder(@NonNull ItemMenuBinding binding) {

            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
