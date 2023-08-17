package com.improve10x.learningplatform.contactus;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactUsViewModel extends ViewModel {
    public MutableLiveData<String> message = new MutableLiveData<>("Type your message here");
}
