package me.daniel.primeNumbers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import java.math.BigInteger;

import java.util.ArrayList;

public class FileManager {
    private String fileName;
    
    public FileManager(String fileName) {
        this.fileName = fileName;
    }
    
    public void saveArrayToFile(ArrayList<BigInteger> array) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, false));
            for(BigInteger number : array) {
                writer.println(number+"\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
