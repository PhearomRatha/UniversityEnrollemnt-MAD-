package com.example.ppy3_application.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.ppy3_application.PaymentActivity;
import com.example.ppy3_application.R;
import com.example.ppy3_application.StartActivity;
import com.example.ppy3_application.databinding.FragmentEnrollmentBinding;


public class EnrollmentFragment extends Fragment {

    FragmentEnrollmentBinding binding;

    PaymentActivity paymentActivity = new PaymentActivity();

    public EnrollmentFragment() {

        super(R.layout.fragment_enrollment);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEnrollmentBinding.inflate(getLayoutInflater());

        String[] options = {"G9-ITE-A1", "G9-ITE-A2", "G9-ITE-A3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_spinner_item,
                options
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.spClass.setAdapter(adapter);

        binding.btnPayment.setOnClickListener(v -> {SubmitPayment(); });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    private void SubmitPayment() {
        Intent intent = new Intent(requireActivity(), PaymentActivity.class);
        startActivity(intent);
    }
}