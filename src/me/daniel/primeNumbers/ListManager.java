package me.daniel.primeNumbers;

import java.math.BigInteger;

import java.util.ArrayList;

class ListManager {
    private ArrayList<BigInteger> numbersList;
    private int cursor;
    
    ListManager(ArrayList<BigInteger> numbersList) {
        this.numbersList = numbersList;
    }
    
    /*
     * Working on list
     */
    
    void addNumber(BigInteger number) {
        numbersList.add(number);
    }
    
    BigInteger getNumber() {
        if(numbersList.size() > 0) {
            return numbersList.get(cursor);
        }
        System.err.println("Nie ma liczb w liście");
        System.exit(1);
        return new BigInteger("0");
    }
    
    void removeNumber() {
        numbersList.remove(cursor);
        cursorBackward();
    }
    
    /*
     * Working on cursor
     */

    boolean cursorForward() {
        if(cursor < numbersList.size()-1) {
            cursor++;
            return true;
        }
        return false;
    }
    
    boolean cursorBackward() {
        if(cursor > 0) {
            cursor--;
            return true;
        }
        return false;
    }
    
    void resetCursor() {
        cursor = 0;
    }
}
