package com.improve10x.learningplatform.contactus;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

public class SendMessageControllerImplTest extends TestCase {

    private  ContactUsActivity contactUsActivity = new ContactUsActivity();

    public void testSendMessage() {
        assertEquals("", contactUsActivity.sendMessage(null));
    }

    public void testSendMessageEmpty_returnEmpty() {
        assertEquals("", contactUsActivity.sendMessage(""));
    }

    public void testSendMessageC_returnC() {
        assertEquals("C", contactUsActivity.sendMessage("C"));
    }

    public void testSendMessageCWithSpace_returnC() {
       assertEquals("C", contactUsActivity.sendMessage("  C  "));
    }

    public void testSendMessage_returnMessage() {
        assertEquals("Hi There is a problem with login", contactUsActivity.sendMessage("Hi There is a problem with login"));
    }
}