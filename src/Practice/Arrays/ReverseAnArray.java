package Practice.Arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args){
        int [] arr = {2,4,6,88,99,4,5,34,69,32};
        //Iteration method using two pointers approach
        // In-place reversal
        int start=0;
        int end = arr.length-1;

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr)); // [32, 69, 34, 5, 4, 99, 88, 6, 4, 2]

        // using a new array
        System.out.println("Using new array method : ");
        int res=0;
        int [] rev = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            rev[res++]=arr[i];
        }
        System.out.println(Arrays.toString(rev)); // [2, 4, 6, 88, 99, 4, 5, 34, 69, 32]
    }
}
