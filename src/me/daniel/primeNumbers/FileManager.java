package me.daniel.primeNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Scanner;

class FileManager {
    private File file;
    
    FileManager(String fileName) {
        file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    ArrayList<BigInteger> getListFromFile() {
        ArrayList<BigInteger> numbersList = new ArrayList<BigInteger>();
        try {
            Scanner scan = new Scanner(file);
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
            PrintWriter writer = new PrintWriter(file);
            for(BigInteger number : list) {
                writer.println(number);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
