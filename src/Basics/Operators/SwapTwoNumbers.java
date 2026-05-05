package Basics.Operators;

public class SwapTwoNumbers {
    public static void main(String[] args){
        //swapping two numbers using XOR operation
        int a=5,b=12;
        a = a^b;
        b=a^b;
        a=a^b;

        System.out.println(a + "," + b);
    }
}
