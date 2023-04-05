package five;

import java.util.Scanner;

public class Main {
//    Part 1
//
//Using Maps create a class that allows someone to instantiate
// with a number between 1 and 25 representing the number of shifts.
// Have 2 methods one that encrypts a message from their chosen shift and one that decrypts from chosen shift.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encrypt first = new Encrypt(Integer.parseInt(scanner.nextLine()));
        first.EncryptMethod();
    }
}