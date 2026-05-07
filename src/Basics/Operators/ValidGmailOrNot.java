package Basics.Operators;

public class ValidGmailOrNot {
    public static void main(String[] args){
        String str = "programmer@gmail.com";

        int res = str.indexOf("@");
        String uname = str.substring(0,res);
        String domain = str.substring(res+1,str.length());

        System.out.println("username is: "+ uname);
        System.out.println("domain name is: "+ domain);

        System.out.println(domain.startsWith("gmail"));



    }
}
