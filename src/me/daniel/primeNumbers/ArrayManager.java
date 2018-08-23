package me.daniel.primeNumbers;

import java.math.BigInteger;
import java.util.ArrayList;

public class ArrayManager {
    private ArrayList<BigInteger> numbersList;
    private int cursor;
    
    public ArrayManager() {
        numbersList = new ArrayList<BigInteger>();
    }
    
    public void addNumber(BigInteger number) {
        numbersList.add(number);
    }
    
    public void resetCursor() {
        cursor = 0;
    }
    
    /*
     * Getters and setters
     */
    
    public ArrayList<BigInteger> getNumbersList() {
        return numbersList;
    }
}
