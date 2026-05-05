package Basics.Operators;

import java.util.Scanner;

public class AreaOfTriangle2 {
    public static void main(String[] args){
        System.out.println("Enter the values of A,B,C : ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle is : "+area);
    }
}
