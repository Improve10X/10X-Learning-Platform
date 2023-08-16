package com.improve10x.learningplatform;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.improve10x.learningplatform.contactus.ContactUsActivity;
import com.improve10x.learningplatform.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(getLayoutInflater());
        handleProfile();
        handlePersonalInformation();
        handleContactUs();
        return binding.getRoot();
    }

    private void handleProfile() {
        binding.profileLayout.setOnClickListener(v -> {
            handlePersonalInformation();
        });
    }

    private void handlePersonalInformation() {
        binding.personalInformationLayout.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), PersonalInformationFragment.class);
            startActivity(intent);
        });
    }

    private void handleSettings() {
    }

    private void handleContactUs() {
        binding.contactUsLayout.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ContactUsActivity.class);
            startActivity(intent);
        });
    }

    private void handleLogout() {}
}