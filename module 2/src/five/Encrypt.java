package five;

public class Encrypt {
    Character input;
    int output;
    public Encrypt(Character input){
        this.input = input;
    }
    public void EncryptMethod(){
        input = (char) (input + 2);
        System.out.println(input);
    }
    public String toString(){
        return "the input " + input;
    }
}
