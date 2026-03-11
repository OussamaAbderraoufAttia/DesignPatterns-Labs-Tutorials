package com.esi.designpatterns;

public class TransferService {
    private FinancialTrustService trustService;

    public TransferService(FinancialTrustService trustService) {
        this.trustService = trustService;
    }

    public void setTrustService(FinancialTrustService trustService) {
        this.trustService = trustService;
    }

    public void transfer(String senderID, String recipientID, int amount) {
        boolean approved = trustService.post(senderID, recipientID, amount);
        if (approved) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed!");
        }
    }
}
