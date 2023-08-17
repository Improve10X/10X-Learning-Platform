package com.improve10x.learningplatform.workshops;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.improve10x.learningplatform.R;
import com.improve10x.learningplatform.databinding.ActivityWorkShopBinding;

public class WorkShopActivity extends AppCompatActivity {

    private ActivityWorkShopBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWorkShopBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadFragment(new DummyFragment());
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.root_layout, fragment)
                .commit();
    }
}