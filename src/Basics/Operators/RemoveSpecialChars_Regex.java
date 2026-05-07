package Basics.Operators;

public class RemoveSpecialChars_Regex {
    public static void main(String[] args){
        String str = "a!b@c#1$2%3";
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
    }
}
