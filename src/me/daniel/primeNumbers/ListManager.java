package me.daniel.primeNumbers;

import java.math.BigInteger;

import java.util.ArrayList;

public class ListManager {
    private ArrayList<BigInteger> numbersList;
    private int cursor;
    
    public ListManager() {
        numbersList = new ArrayList<BigInteger>();
    }
    
    /*
     * Working on list
     */
    
    public void addNumber(BigInteger number) {
        numbersList.add(number);
    }
    
    public BigInteger getNumber() {
        return numbersList.get(cursor);
    }
    
    public void removeNumber() {
        numbersList.remove(cursor);
        cursorBackward();
    }
    
    /*
     * Working on cursor
     */

    public void cursorForward() {
        if(cursor < numbersList.size()-1) {
            cursor++;
        }
    }
    
    public void cursorBackward() {
        if(cursor > 0) {
            cursor--;
        }
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
