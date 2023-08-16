package com.improve10x.learningplatform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.learningplatform.databinding.ActivityWorkShopBinding;

public class WorkShopActivity extends AppCompatActivity {

    private ActivityWorkShopBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkShopBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}