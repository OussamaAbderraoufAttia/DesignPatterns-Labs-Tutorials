package com.esi.designpatterns;

public class OtherBankTrustService implements FinancialTrustService {
    @Override
    public boolean post(String senderID, String recipientID, int amount) {
        System.out.println("Processing Bank transfer (Other Bank) from " + senderID + " to " + recipientID + " for " + amount + " DA");
        return true;
    }
}
