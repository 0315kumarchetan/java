import java.util.*;
class ngor{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int  i =0 ;i<n ;i++){
            arr[i]=scn.nextInt();
        }

        // int[] res = sol_ngor(arr);
        // for(int i:res){
        //     System.out.print(i+" ");
        // }
        // int[] resL = sol_ngol(arr);
        // for(int i:resL){
        //     System.out.print(i+" ");
        // }
        // int[] res_of_small_on_right = sol_nsor(arr);
        // for(int i:res_of_small_on_right){
        //     System.out.print(i+" ");
        // }
        int[] res_of_small_on_Left = sol_nsol(arr);
        for(int i:res_of_small_on_Left){
            System.out.print(i+" ");
        }
    }
    public static int[] sol_ngor(int[] arr){

            Stack<Integer> st = new Stack<>();

            int[] nxtGreaterRight = new int[arr.length];
            nxtGreaterRight[arr.length-1]=-1;
            st.push(arr.length-1);

            for (int i = arr.length-2;i>=0;i--){
                while(st.size()!=0 && arr[st.peek()]<=arr[i]){
                    st.pop();    
                }
                    if (st.size()==0){
                        nxtGreaterRight[i]=-1;   
                    }
                    else{
                        nxtGreaterRight[i]=arr[st.peek()];
                    }
                st.push(i);
            }
            return nxtGreaterRight;
    }
    public static int[] sol_ngol(int[] arr){

        Stack<Integer> st =new Stack<>();
        int[] nxtEleLeft = new int[arr.length];

        nxtEleLeft[0]=-1;
        st.push(0);
        for(int i =1;i<arr.length;i++){
            while(st.size()!=0 && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.size()!=0)
            {
                nxtEleLeft[i]=arr[st.peek()];
            }
            else{
                nxtEleLeft[i]=-1;
            }
            st.push(i);
        }
        return nxtEleLeft;
    }
    public static int[] sol_nsor(int[] arr){

        Stack<Integer> st =new Stack<>();
        int[] nxtSmallEleRight = new int[arr.length];

        nxtSmallEleRight[arr.length-1]=arr.length;
        st.push(arr.length-1);
        for(int i =arr.length-2;i>=0;i--){
            while(st.size()!=0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()!=0)
            {
                nxtSmallEleRight[i]=arr[st.peek()];
            }
            else{
                nxtSmallEleRight[i]=arr.length;
            }
            st.push(i);
        }
        return nxtSmallEleRight;
    }     
    public static int[] sol_nsol(int[] arr){

        Stack<Integer> st =new Stack<>();
        int[] nxtSmallLeft = new int[arr.length];

        nxtSmallLeft[0]=-1;
        st.push(0);
        for(int i =1;i<arr.length;i++){
            while(st.size()!=0 && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()!=0)
            {
                nxtSmallLeft[i]=arr[st.peek()];
            }
            else{
                nxtSmallLeft[i]=-1;
            }
            st.push(i);
        }
        return nxtSmallLeft;
    }   


       
    
}