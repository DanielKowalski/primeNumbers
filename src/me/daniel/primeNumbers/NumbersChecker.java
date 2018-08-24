package me.daniel.primeNumbers;

class NumbersChecker {
    private ListManager listManager;
    private FileManager fileManager;
    
    NumbersChecker(ListManager arrayManager) {
        this.listManager = arrayManager;
        fileManager = new FileManager("primeNumbers.txt");
    }
    
    public static void main(String[]args) {
        new NumbersChecker(new ListManager());
    }
}
