package five;

public class Decrypt {
    int number;
    public Decrypt(int number){
        this.number = number;
    }
    public void DecryptMethod(){
        number = (char) (number + 2);
        System.out.println(number);
    }
    public String toString(){
        return "Replacement " + number;
    }
}
