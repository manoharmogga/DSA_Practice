package Practice.Arrays;

public class KadaneAlgorithm {
    public  static void main(String[] args){
        //Kadane's Algorithm - Dynamic program approach
        // O(n) - Time complexity
        int[] arr ={-1,2,36,4,-9,7,9,-44,65};

        int max= arr[0];
        int curr = arr[0];

        for(int i=1;i< arr.length;i++){
            int num = arr[i];
            curr=Math.max(num,curr+num);
            max=Math.max(curr,max);
        }
        System.out.println(max);
    }
}
