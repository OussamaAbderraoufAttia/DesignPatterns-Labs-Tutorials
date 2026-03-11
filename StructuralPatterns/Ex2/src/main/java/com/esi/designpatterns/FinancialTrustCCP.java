package com.esi.designpatterns;

public class FinancialTrustCCP implements FinancialTrustService {
    @Override
    public boolean post(String senderID, String recipientID, int amount) {
        System.out.println("Processing CCP transfer (La Poste) from " + senderID + " to " + recipientID + " for " + amount + " DA");
        return true;
    }
}
