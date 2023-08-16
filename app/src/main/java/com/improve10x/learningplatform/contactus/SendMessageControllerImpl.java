package com.improve10x.learningplatform.contactus;

public class SendMessageControllerImpl implements SendMessageController {

    @Override
    public String sendMessage(String message) {
        String result = "";
        if (message == null) {
        } else {
            result = message.trim();
        }
        return result;
    }
}
