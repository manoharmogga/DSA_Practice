package Practice.Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int [] arr={11,23,4,3,55,4,56,34};
        int n= arr.length;
        int x=56;

        for (int i =0;i<n;i++){
            if(arr[i]==x){
                System.out.println("The element is present in the index of : "+i);
                break;
            }
        }
    }
}
