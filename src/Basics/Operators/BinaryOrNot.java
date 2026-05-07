package Basics.Operators;

public class BinaryOrNot {
    public static void main(String[] args){
        int num = 10110001;
        String str = String.valueOf(num);
        System.out.println(str.matches("[01]+"));
    }
}
