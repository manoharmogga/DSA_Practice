package Basics.Conditional_Statements;

import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the url: ");
        String url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));

        if (protocol.equals("http")){
            System.out.println("HYPER TEXT TRANSFER PROTOCOL");
        } else if (protocol.equals("ftp")) {
            System.out.println("FILE TRANSFER PROTOCOL");
        }

        String ext = url.substring(url.lastIndexOf(".")+1);

        if (ext.equals("com")){
            System.out.println("Commercial");
        } else if (ext.equals("org")) {
            System.out.println("Organisation");
        }else if (ext.equals("net")){
            System.out.println("Network");
        }
    }
}
