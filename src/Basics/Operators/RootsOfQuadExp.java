package Basics.Operators;

import java.util.Scanner;

public class RootsOfQuadExp {
    public static void main(String[] args){
        int a,b,c;
        double r1, r2;

        System.out.println("Enter the values of the Quad Exp: A, B, C :");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        r1 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        r2 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("Roots of the r1  : " + r1 + " " + r2);
    }
}
