package Basics.Operators;

import java.util.Scanner;

public class VolumeOfCuboid {
    public static void main(String[] args){
        int l,b,h;
        int vol, area;

        System.out.println("Enter the values of A, B, C: ");
        Scanner sc = new Scanner(System.in);

        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();

        area = 2*(l*b+b*h+h*l);
        vol = l*b*h;

        System.out.println("Area of the cuboid: " + area);
        System.out.println("Volume of the cuboid: " + vol);
    }
}
