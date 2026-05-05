package Basics.Operators;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of the triangle :");
        float b=sc.nextFloat();
        float h =sc.nextFloat();
        float area = (b * h)/2;
        System.out.println("Area of the triangle is : "+area);
    }
}
