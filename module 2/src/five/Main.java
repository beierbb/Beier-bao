package five;

import java.util.*;

public class Main {
//    Part 1
//
// Using Maps create a class that allows someone to instantiate
// with a number between 1 and 25 representing the number of shifts.
// Have 2 methods one that encrypts a message from their chosen shift and one that decrypts from chosen shift.
    public static void main(String[] args) {
        LinkedHashMap<Encrypt, Decrypt> value = new LinkedHashMap<>();
        String list = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i<26; i++){
            alphabet.add(Character.valueOf(list.charAt(i)));
            value.put(new Encrypt(alphabet.get(i)), new Decrypt(i+1));
        }
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine().toLowerCase().replaceAll("\\p{P}", "");
        Encrypt first = new Encrypt(inputValue.charAt(0));
        first.EncryptMethod();
    }
}