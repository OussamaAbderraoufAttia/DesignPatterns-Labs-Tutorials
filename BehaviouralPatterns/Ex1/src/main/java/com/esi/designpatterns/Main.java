package com.esi.designpatterns;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String testData = "Hello Design Patterns!";
        String fileName = "test.txt";

        System.out.println("Original text: " + testData);

        // 1. Write encrypted data
        try (Writer writer = new EncryptedWriter(new FileWriter(fileName))) {
            writer.write(testData.toCharArray(), 0, testData.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Read raw (encrypted) data to show it's actually encrypted
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Raw text from file (encrypted): " + reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Read and decrypt data
        try (Reader reader = new DecryptedReader(new FileReader(fileName))) {
            char[] buffer = new char[100];
            int charsRead = reader.read(buffer, 0, buffer.length);
            System.out.println("Decrypted text: " + new String(buffer, 0, charsRead));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Clean up
        new File(fileName).delete();
    }
}
