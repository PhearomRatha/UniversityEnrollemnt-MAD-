package com.example.ppy3_application.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ppy3_application.R;
import com.example.ppy3_application.databinding.FragmentInformationBinding;


public class InformationFragment extends Fragment {

    FragmentInformationBinding binding;

    public InformationFragment() {
        super(R.layout.fragment_information);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInformationBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}