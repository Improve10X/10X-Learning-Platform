package com.improve10x.learningplatform.contactus;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

public class SendMessageControllerImplTest extends TestCase {
    private SendMessageControllerImpl sendMessageController = new SendMessageControllerImpl();

    public void testSendMessage() {
        assertEquals("", sendMessageController.sendMessage(null));
    }

    public void testSendMessageEmpty_returnEmpty() {
        assertEquals("", sendMessageController.sendMessage(""));
    }

    public void testSendMessageC_returnC() {
        assertEquals("C", sendMessageController.sendMessage("C"));
    }

    public void testSendMessageCWithSpace_returnC() {
       assertEquals("C", sendMessageController.sendMessage("  C  "));
    }

    public void testSendMessage_returnMessage() {
        assertEquals("Hi There is a problem with login", sendMessageController.sendMessage("Hi There is a problem with login"));
    }
}