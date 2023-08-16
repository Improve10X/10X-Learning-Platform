package com.improve10x.learningplatform.contactus;

import static org.junit.Assert.assertThrows;

import junit.framework.TestCase;

public class SendMessageControllerImplTest extends TestCase {

    public void testSendMessage() {
        String expected = "";
        String actual = new SendMessageControllerImpl().sendMessage(null);
        assertEquals(expected, actual);
    }

    public void testSendMessageEmpty_returnEmpty() {
        String expected = "";
        String actual = new SendMessageControllerImpl().sendMessage("");
        assertEquals(expected, actual);
    }

    public void testSendMessageC_returnC() {
        String expected = "C";
        String actual = new SendMessageControllerImpl().sendMessage("C");
        assertEquals(expected, actual);
    }

    public void testSendMessageCWithSpace_returnC() {
        String expected = "C";
        String actual = new SendMessageControllerImpl().sendMessage("  C  ");
        assertEquals(expected, actual);
    }


    public void testSendMessage_returnMessage() {
        String expected = "Hi There is a problem with login";
        String actual = new SendMessageControllerImpl().sendMessage("Hi There is a problem with login");
        assertEquals(expected, actual);
    }
}