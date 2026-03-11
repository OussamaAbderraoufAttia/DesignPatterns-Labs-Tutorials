package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        // Create CCP service
        FinancialTrustService ccpService = new FinancialTrustCCP();
        
        // Inject into TransferService
        TransferService transferService = new TransferService(ccpService);
        
        System.out.println("--- Using CCP Service ---");
        transferService.transfer("USER1", "USER2", 5000);
        
        System.out.println("\n--- Switching to Other Bank Service ---");
        FinancialTrustService otherBankService = new OtherBankTrustService();
        transferService.setTrustService(otherBankService);
        transferService.transfer("USER1", "USER3", 10000);
    }
}
