package me.daniel.primeNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Scanner;

class FileManager {
    private String fileName;
    
    FileManager(String fileName) {
        this.fileName = fileName;
    }
    
    ArrayList<BigInteger> getListFromFile() {
        ArrayList<BigInteger> numbersList = new ArrayList<BigInteger>();
        try {
            Scanner scan = new Scanner(new File(fileName));
            while(scan.hasNextBigInteger()) {
                numbersList.add(scan.nextBigInteger());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return numbersList;
    }
    
    void saveListToFile(ArrayList<BigInteger> list) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(fileName, false));
            for(BigInteger number : list) {
                writer.println(number+"\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
