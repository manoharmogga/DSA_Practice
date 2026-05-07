package Basics.Operators;

public class DateFormat_Regex {
    public static void main(String[] args){
        String str = "06/07/2000";
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
