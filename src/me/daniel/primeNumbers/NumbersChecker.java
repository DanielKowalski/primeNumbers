package me.daniel.primeNumbers;

import java.math.BigInteger;

public class NumbersChecker {
    private ArrayManager arrayManager;
    private FileManager fileManager;
    
    public NumbersChecker(ArrayManager arrayManager) {
        this.arrayManager = arrayManager;
    }
    
    public void addNumber(BigInteger number) {
        arrayManager.addNumber(number);
    }
}
