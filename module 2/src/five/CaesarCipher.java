package five;

import java.util.HashMap;

public class CaesarCipher {
    int shift;
    HashMap<Character, Character> encrypted;
    HashMap<Character, Character> decrypted;
    Character alphabet;
    String list = "abcdefghijklmnopqrstuvwxyz";
    public CaesarCipher(int shift){
        this.shift = shift;
        for (int i = 0; i<26; i++) {
            this.alphabet = Character.valueOf(Character.valueOf(list.charAt(i)));
            this.encrypted = new HashMap<>();
            this.decrypted = new HashMap<>();
            encrypted.put(alphabet, (char) (alphabet + shift));
            decrypted.put((char) (alphabet + shift), alphabet);
        }
    }
    public String Encrpted(String str){
        for (int i = 0; i<str.length(); i++) {
            Character value = Character.valueOf(Character.valueOf(str.charAt(i)));
            encrypted.get(value);
        }
        return;
    }
    public String Decrpted(String str){
        for (int i = 0; i<str.length(); i++) {
            Character value1 = Character.valueOf(Character.valueOf(str.charAt(i)));
            decrypted.get(value1);
        }
        return;
    }
}
