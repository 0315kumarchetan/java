import java.util.*;
public class display_reverse_arr_using_recursion {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ;i<n;i++){
            arr[i]= scn.nextInt();
        }

        revDisplay(arr,0);


    }

    public static void revDisplay(int[] arr , int idx){

        if (idx==arr.length){
            return ;
        }

        revDisplay(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
    
}