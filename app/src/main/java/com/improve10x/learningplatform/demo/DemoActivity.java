package com.improve10x.learningplatform.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.learningplatform.R;
import com.improve10x.learningplatform.contactus.ContactUsActivity;
import com.improve10x.learningplatform.databinding.ActivityDemoBinding;
import com.improve10x.learningplatform.profile.profilescreen.ProfileFragment;
import com.improve10x.learningplatform.settings.SettingsFragment;

public class DemoActivity extends AppCompatActivity {
    private ActivityDemoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDemoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleContactUsBtn();
        handleProfileBtn();
        handleSettingsBtn();
    }

    private void handleSettingsBtn() {
        binding.settingsBtn.setOnClickListener(view -> {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, SettingsFragment.class);
            startActivity(intent);
        });
    }

    private void handleProfileBtn() {
        binding.profileBtn.setOnClickListener(view -> {
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ProfileFragment.class);
            startActivity(intent);
        });
    }

    private void handleContactUsBtn() {
        binding.contactusBtn.setOnClickListener(view -> {
            Toast.makeText(this, "Contactus", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ContactUsActivity.class);
            startActivity(intent);
        });
    }


}