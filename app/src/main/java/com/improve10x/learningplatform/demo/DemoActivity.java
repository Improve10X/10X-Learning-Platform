package com.improve10x.learningplatform.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.learningplatform.R;
import com.improve10x.learningplatform.databinding.ActivityDemoBinding;

public class DemoActivity extends AppCompatActivity {
    private ActivityDemoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleContactUsBtn();
    }

    private void handleContactUsBtn() {

    }
}