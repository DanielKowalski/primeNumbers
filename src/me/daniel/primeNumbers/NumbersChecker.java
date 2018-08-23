package me.daniel.primeNumbers;

import java.math.BigInteger;

public class NumbersChecker {
    private ArrayManager arrayManager;
    private FileManager fileManager;
    
    public NumbersChecker(ArrayManager arrayManager) {
        this.arrayManager = arrayManager;
        fileManager = new FileManager("primeNumbers.txt");
    }
    
    public void addNumber(BigInteger number) {
        arrayManager.addNumber(number);
    }
    
    public BigInteger getNumber() {
        return arrayManager.getNumber();
    }
    
    public void saveArray() {
        fileManager.saveArrayToFile(arrayManager.getNumbersList());
    }
    
    public static void main(String[]args) {
        new NumbersChecker(new ArrayManager());
    }
}
