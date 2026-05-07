package Basics.Operators;

public class RemoveExtraSpaces_Regex {
    public static void main(String[] args){
        String str = "abc   ed    gt  juu  hy kkj j  h k h  h k    h k k h   h   ";
        System.out.println(str.replaceAll("\\s+"," ").trim());

        String[] words = str.split("\\s");
        System.out.println(words.length);
    }
}
