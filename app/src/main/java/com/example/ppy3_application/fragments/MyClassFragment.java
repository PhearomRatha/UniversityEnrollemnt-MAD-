package com.example.ppy3_application.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ppy3_application.R;
import com.example.ppy3_application.databinding.FragmentMyClassBinding;


public class MyClassFragment extends Fragment {

    FragmentMyClassBinding binding;


    public MyClassFragment() {
        super(R.layout.fragment_my_class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMyClassBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}