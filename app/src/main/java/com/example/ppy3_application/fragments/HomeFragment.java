package com.example.ppy3_application.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ppy3_application.R;
import com.example.ppy3_application.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    EnrollmentFragment enrollmentFragment = new EnrollmentFragment();

    MyClassFragment myClassFragment = new MyClassFragment();

    StudentCardFragment studentCardFragment = new StudentCardFragment();

    InformationFragment informationFragment = new InformationFragment();



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        // 👉 Make sure you reference the correct view ID
        binding.cardEnrollment.setOnClickListener(v -> { LoadFragment(enrollmentFragment); });
        binding.cardUploadStudentcard.setOnClickListener(v -> {LoadFragment(studentCardFragment);});
        binding.cardNews.setOnClickListener(v -> {LoadFragment(informationFragment);});

        return binding.getRoot(); // ⬅ Return view after setting up everything
    }

    private void LoadFragment(Fragment fragment) {
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}


