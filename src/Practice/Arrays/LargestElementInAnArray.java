package Practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestElementInAnArray {
    public static void main(String[] args){
        int [] arr = {1,2,8,4,0,77,55,99,1807};

        int n= arr.length;
        int max=0;

        // Using Iteration method
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element in an array is : "+max);

        // Using Sorting technique
        Arrays.sort(arr);
        System.out.println("Using Sorting method: "+arr[arr.length-1]);

        //Using Streams technique
        int res= Arrays.stream(arr).max().getAsInt();
        System.out.println("Using Streams method: "+res);

        // using collecions method
        List<Integer> large=new ArrayList<>();
        for(int i : arr){
            large.add(i);
        }
        System.out.println("Using colections method : "+ Collections.max(large));
    }
}
