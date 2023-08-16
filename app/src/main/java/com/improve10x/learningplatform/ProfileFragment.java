package com.improve10x.learningplatform;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ProfileFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    private void handleProfile() {}

    private void handlePersonalInformation() {}

    private void handleSettings() {}

    private void handleContactUs() {}

    private void handleLogout() {}
}