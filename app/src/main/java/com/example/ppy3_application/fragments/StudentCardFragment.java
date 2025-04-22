package com.example.ppy3_application.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ppy3_application.R;
import com.example.ppy3_application.databinding.FragmentStudentCardBinding;


public class StudentCardFragment extends Fragment {

    FragmentStudentCardBinding binding;

    public StudentCardFragment() {

        super(R.layout.fragment_student_card);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStudentCardBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}