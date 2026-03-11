package com.esi.designpatterns;

public interface FinancialTrustService {
    boolean post(String senderID, String recipientID, int amount);
}
