package me.daniel.primeNumbers;

import java.math.BigInteger;

class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    NumbersChecker(ListManager listManager, FileManager fileManager) {
        this.listManager = listManager;
        this.fileManager = fileManager;
    }
    
    private void checkNumber(BigInteger number) {
        listManager.resetCursor();
        do {
            BigInteger remainder = number.mod(listManager.getNumber());
            if(remainder.equals(new BigInteger("0"))) {
                return;
            }
        } while(listManager.cursorForward());
        listManager.addNumber(number);
    }

    public static void main(String[]args) {
        FileManager fileManager = new FileManager("primeNumbers.txt");
        ListManager listManager = new ListManager(fileManager.getListFromFile());
        new NumbersChecker(listManager, fileManager);
    }
}
