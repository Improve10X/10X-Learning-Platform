package com.improve10x.learningplatform.contactus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.learningplatform.R;
import com.improve10x.learningplatform.databinding.ActivityContactUsBinding;

public class ContactUsActivity extends AppCompatActivity {

    public ContactUsViewModel contactUsViewModel;
    private ActivityContactUsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityContactUsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Contact Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        contactUsViewModel = new ContactUsViewModel();
        handleSendMessageButton(binding.messageTxt.toString());
    }

    private void handleSendMessageButton(String message) {
        binding.sendMessageBtn.setOnClickListener(v -> {
            sendMessage(message);
        });
    }

    public String sendMessage(String message) {
        String result = "";
        if (message == null) {
        } else {
            result = message.trim();
        }
        return result;
    }
}