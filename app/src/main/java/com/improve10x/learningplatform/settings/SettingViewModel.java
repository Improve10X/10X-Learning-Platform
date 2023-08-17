package com.improve10x.learningplatform.settings;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {
    private MutableLiveData<Boolean> notificationSwitch = new MutableLiveData<>();
    private MutableLiveData<Boolean> sendTestNotificationSwitch = new MutableLiveData<>();
    private MutableLiveData<Boolean> soundSwitch = new MutableLiveData<>();

    public MutableLiveData<Boolean> getNotificationSwitch() {
        return notificationSwitch;
    }

    public void setNotificationSwitch(MutableLiveData<Boolean> notificationSwitch) {
        this.notificationSwitch = notificationSwitch;
    }

    public MutableLiveData<Boolean> getSendTestNotificationSwitch() {
        return sendTestNotificationSwitch;
    }

    public void setSendTestNotificationSwitch(MutableLiveData<Boolean> sendTestNotificationSwitch) {
        this.sendTestNotificationSwitch = sendTestNotificationSwitch;
    }

    public MutableLiveData<Boolean> getSoundSwitch() {
        return soundSwitch;
    }

    public void setSoundSwitch(MutableLiveData<Boolean> soundSwitch) {
        this.soundSwitch = soundSwitch;
    }
}
