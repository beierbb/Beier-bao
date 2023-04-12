package five;

import java.util.*;

public class Main {
// Using Maps create a class that allows someone to instantiate
// with a number between 1 and 25 representing the number of shifts.
// Have 2 methods one that encrypts a message from their chosen shift and one that decrypts from chosen shift.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputValue = scanner.nextLine().toLowerCase().replaceAll("\\p{P}", "");
        System.out.println("Number of Shifts: ");
        CaesarCipher num = new CaesarCipher(Integer.parseInt(scanner.nextLine()));
        System.out.println(num.Encrpted(inputValue));
        System.out.println(num.Decrpted(inputValue));
    }
}