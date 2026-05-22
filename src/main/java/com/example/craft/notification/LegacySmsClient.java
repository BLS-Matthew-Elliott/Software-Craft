package com.example.craft.notification;

/*
 * this is a third-party or legacy SMS library.
 * We do not control its method names or parameters.
 */
public class LegacySmsClient {

    public void sendTextMessage(String mobileNumber, String body, boolean urgent, String accountCode) {
        System.out.println("LEGACY SMS");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Body: " + body);
        System.out.println("Urgent: " + urgent);
        System.out.println("Account: " + accountCode);
    }
}