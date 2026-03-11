package com.esi.designpatterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Setup the chain
        CardHandler chain = new VisaHandler();
        CardHandler master = new MasterHandler();
        CardHandler amex = new AmExHandler();
        
        chain.setNext(master);
        master.setNext(amex);

        // Simulation of records from a file
        String[] records = {
            "4123456789012,12/25,Oussama", // Visa (13 digits)
            "5123456789012345,10/26,Ahmed", // Master (Starts 51)
            "342345678901234,01/24,Karim", // AmEx (Starts 34)
            "6123456789012345,05/27,Inconnu" // Invalid
        };

        for (String record : records) {
            String[] fields = record.split(",");
            String number = fields[0];
            String expiry = fields[1];
            String owner = fields[2];

            CreditCard card = chain.handle(number, expiry, owner);
            if (card != null) {
                System.out.println("Processing: " + card);
            } else {
                System.err.println("Invalid or unsupported card: " + number);
            }
        }
    }
}
