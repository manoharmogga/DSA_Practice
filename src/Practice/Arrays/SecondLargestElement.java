package Practice.Arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int [] arr={1,10,2,30,4,5,44,57,66,5,99};

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second && j != first) {
                second = j;
            }
        }
        System.out.println("Second largest element is : "+ second);
    }
}
