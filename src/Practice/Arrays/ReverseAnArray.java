package Practice.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
    public static void main(String[] args){
        int [] arr = {2,4,6,88,99,4,5,34,69,32};
        //Iteration method
        int start=0;
        int end = arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
