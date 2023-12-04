package Ex3;

import java.util.ArrayList;

public class SMSList {
    ArrayList<SMS> smsList;
    static int max_characters_per_sms = 160;

    public SMSList() {
        this.smsList = new ArrayList<>();
    }

    public void addSMS(SMS sms) {
        if (sms.content.length() <= max_characters_per_sms) {
            smsList.add(sms);
        } else {
            System.out.println("SMS content exceeds maximum character limit!");
        }
    }

    public void displaySMS(int index) {
        System.out.println("======================================");
        if (index >= 0 && index < smsList.size()) {
            SMS sms = smsList.get(index);
            System.out.println("Subject: " + sms.subject);
            System.out.println("From: " + sms.fromPhoneNumber);
            System.out.println("To: " + sms.receiverNumber);
            System.out.println("Type: " + sms.type);
            System.out.println("Content: " + sms.content);
            System.out.println("Status: " + sms.status);
        } else {
            System.out.println("Invalid SMS index!");
        }
        System.out.println("======================================");
    }

    public void displayAllSMS() {
        for (int i = 0; i < smsList.size(); i++) {
            System.out.println("SMS " + (i + 1) + ":");
            displaySMS(i);
            System.out.println();
        }
    }

    public void removeSMS(int index) {
        System.out.println("======================================");
        if (index >= 0 && index < smsList.size()) {
            smsList.remove(index);
            System.out.println("SMS removed successfully!");
        } else {
            System.out.println("Invalid SMS index!");
        }
        System.out.println("======================================");
    }
}
