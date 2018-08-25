package me.daniel.primeNumbers;

import java.math.BigInteger;

class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    NumbersChecker(ListManager listManager, FileManager fileManager) {
        this.listManager = listManager;
        this.fileManager = fileManager;
        
        checkNumbers(10);
    }
    
    private void checkNumbers(int numbersToCheck) {
        listManager.setCursorOnLastPosition();
        BigInteger number = listManager.getNumber();
        for(int i = 0; i < numbersToCheck; i++) {
            number = number.add(new BigInteger("2"));
            if(isPrime(number)) {
                listManager.addNumber(number);
            }
        }
        fileManager.saveListToFile(listManager.getNumbersList());
    }

    private boolean isPrime(BigInteger number) {
        System.out.println("Sprawdzam liczbę: "+number);
        listManager.resetCursor();
        do {
            BigInteger remainder = number.mod(listManager.getNumber());
            if(remainder.equals(new BigInteger("0"))) {
                System.out.println("Liczba "+number+" nie jest pierszwa.");
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
