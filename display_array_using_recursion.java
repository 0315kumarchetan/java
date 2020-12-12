import java.util.*;
public class display_array_using_recursion {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i =0 ;i<n;i++){
            arr[i]=scn.nextInt();
        }
        display(arr,0);
    }
    public static void display(int[] arr,int indx){
        if (indx==arr.length){
            return ;
        }
        System.out.print(arr[indx]+" ");
        display(arr,indx+1);

    }   
}