package Basics.Loops;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m=n;
        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }
        if (rev==m){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
