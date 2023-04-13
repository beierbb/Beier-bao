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
//        initiate the hashmap with the letters
        this.encrypted = new HashMap<>();
        this.decrypted = new HashMap<>();
        for (int i = 0; i<26; i++) {
            this.alphabet = list.charAt(i);
            encrypted.put(alphabet, (char) (alphabet + shift));
            decrypted.put((char) (alphabet + shift), alphabet);
        }
    }

    /**
     * Takes in a word and shifts each letter by the shift amount when the object was instantiated.
     * Example: "hello" with a shift of 1 returns: "ifmmp"
     *
     * @param word a single word without punctuation.
     * @return encrypted word, if the parameter was incorrectly entered returns null.
     */
    public String encryptWord(String word) {
        if (word.contains(" ")) {
            return null;
        }
        String encryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            Character value = word.charAt(i);
            encryptedWord += encrypted.get(value);
        }
        return encryptedWord;
    }
    /**
     * Takes in an encrypted word and shifts each letter back to the original word
     * by the shift amount when the object was instantiated.
     *
     * @param word a single word without punctuation.
     * @return encrypted word, if the parameter was incorrectly entered returns null.
     */
    public String decryptWord(String word) {
        if (word.contains(" ")) {
            return null;
        }
        String decryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            Character value = word.charAt(i);
            decryptedWord += decrypted.get(value);
        }
        return decryptedWord;
    }
}
