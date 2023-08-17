package com.improve10x.learningplatform.settings;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {
    private MutableLiveData<Boolean> notificationSwitch = new MutableLiveData<>();
    private MutableLiveData<Boolean> sendTestNotificationSwitch = new MutableLiveData<>();
    private MutableLiveData<Boolean> soundSwitch = new MutableLiveData<>();


}
