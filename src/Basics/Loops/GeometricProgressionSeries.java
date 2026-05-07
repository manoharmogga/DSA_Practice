package Basics.Loops;

import java.util.Scanner;

public class GeometricProgressionSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int sum = a;

        for (int i = 0; i <= n; i++) {
            System.out.print(sum + ",");
            sum = sum * d;
        }
    }
}

