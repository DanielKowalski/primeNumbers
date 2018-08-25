package me.daniel.primeNumbers;

import java.math.BigInteger;

class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    NumbersChecker(ListManager listManager, FileManager fileManager) {
        this.listManager = listManager;
        this.fileManager = fileManager;
    }
    
    private void checkNumbers(int numbersToCheck) {
        listManager.setCursorOnLastPosition();
        BigInteger number = listManager.getNumber();
        for(int i = 0; i < numbersToCheck; i++) {
            if(isPrime(number)) {
                listManager.addNumber(number);
            }
            number = number.add(new BigInteger("2"));
        }
        fileManager.saveListToFile(listManager.getNumbersList());
    }

    private boolean isPrime(BigInteger number) {
        System.out.println("Sprawdzam liczbę: "+number);
        listManager.resetCursor();
        do {
            BigInteger remainder = number.mod(listManager.getNumber());
            if(remainder.equals(new BigInteger("0"))) {
                System.err.println("Liczba "+number+" nie jest pierszwa.");
                return false;
            }
        } while(listManager.cursorForward());
        System.out.println("Liczba "+number+" jest pierwsza");
        return true;
    }

    public static void main(String[]args) {
        FileManager fileManager = new FileManager("primeNumbers.txt");
        ListManager listManager = new ListManager(fileManager.getListFromFile());
        new NumbersChecker(listManager, fileManager);
    }
}
