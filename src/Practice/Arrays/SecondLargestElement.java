package Practice.Arrays;

public class SecondLargestElement {
    public static void main(String[] args){
        int [] arr={1,10,2,30,4,5,44,57,66,5,99};

        if (arr.length<2){
            System.out.println("Array must have two elements");
        }

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            } else if (arr[i]>second && arr[i]!=first) {
                second=arr[i];
            }
        }
        System.out.println("Second largest element is : "+ second);
    }
}
