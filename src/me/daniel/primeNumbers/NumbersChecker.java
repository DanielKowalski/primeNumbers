package me.daniel.primeNumbers;

import java.math.BigInteger;

public class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    public NumbersChecker(ListManager arrayManager) {
        this.listManager = arrayManager;
        fileManager = new FileManager("primeNumbers.txt");
    }
    
    public void addNumber(BigInteger number) {
        listManager.addNumber(number);
    }
    
    public BigInteger getNumber() {
        return listManager.getNumber();
    }
    
    public void saveList() {
        fileManager.saveListToFile(listManager.getNumbersList());
    }
    
    public static void main(String[]args) {
        new NumbersChecker(new ListManager());
    }
}
