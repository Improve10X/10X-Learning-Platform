package com.improve10x.learningplatform.settings;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.improve10x.learningplatform.R;

public class SettingsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setTitle("Settings");
        actionBar.setDisplayHomeAsUpEnabled(true);
        handleBackBtn();
        handleEnableAndDisableNotificationBtn();
        handleSendTestNotification();
        handleEnableAndDisableSound();
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    private void handleEnableAndDisableSound() {

    }

    private void handleSendTestNotification() {

    }

    private void handleEnableAndDisableNotificationBtn() {

    }

    private void handleBackBtn() {

    }
}