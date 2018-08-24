package me.daniel.primeNumbers;

public class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    public NumbersChecker(ListManager arrayManager) {
        this.listManager = arrayManager;
        fileManager = new FileManager("primeNumbers.txt");
    }
    
    public static void main(String[]args) {
        new NumbersChecker(new ListManager());
    }
}
