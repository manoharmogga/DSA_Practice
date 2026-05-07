package Basics.Operators;

public class HexaOrNot {
    public static void main(String[] args){
        String str = "234AB";
        System.out.println(str.matches("[0-9A-Z]+"));
    }
}
