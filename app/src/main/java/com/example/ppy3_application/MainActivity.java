package com.example.ppy3_application;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ppy3_application.databinding.ActivityMainBinding;
import com.example.ppy3_application.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    HomeFragment homeFragment = new HomeFragment();

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.GropLogo.setOnClickListener(v -> {
            Intent intent =new Intent(this,SettingActivity.class);
            startActivity(intent);
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();


    }



}