package me.daniel.primeNumbers;

import java.math.BigInteger;

class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    NumbersChecker(ListManager listManager, FileManager fileManager) {
        this.listManager = listManager;
        this.fileManager = fileManager;
    }

    private boolean isPrime(BigInteger number) {
        listManager.resetCursor();
        do {
            BigInteger remainder = number.mod(listManager.getNumber());
            if(remainder.equals(new BigInteger("0"))) {
                return false;
            }
        } while(listManager.cursorForward());
        return true;
    }

    public static void main(String[]args) {
        FileManager fileManager = new FileManager("primeNumbers.txt");
        ListManager listManager = new ListManager(fileManager.getListFromFile());
        new NumbersChecker(listManager, fileManager);
    }
}
