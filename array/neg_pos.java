 class neg_pos1 {
    
    public int[]  sol(int[] arr){
    //     int j = arr.length-1;
    //     int i = 0;
    //     int temp;
    // while ( i < j ) {
    //     if(arr[i]>0 && arr[j]<0){
    //         i++;
    //         j--;
    //     }
    //     else if(arr[i]<0 && arr[j]>0){
    //         temp = arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         j--;
    //         i++;
    //     }
    //     else if(arr[i]<0 && arr[j]<0){
    //             j--;
    //     }
    //     else if(arr[i]>0 && arr[j]>0){
    //         i++;
    //     }

    // }{-1,-5,8,-9,55,-56,90,56,34,-8,76,-89,-45,89,-234};
    int piviot =-1;
    int i= 0;
    while(i<arr.length){
        if(arr[i]<0){
            i++;
        }
        else{
            int temp = arr[++piviot];
            arr[piviot]=arr[i];
            arr[i]=temp;
            //piviot++;
            i++;
            }

    }
        return arr;
    }
    public int[]  zero_one(int[] arr){
        int piviot = -1;
        int i = 0;
        while(i<arr.length){
            if(arr[i]==0){
                int temp = arr[++piviot];
                arr[piviot]=arr[i];
                arr[i]=temp;
                i++;
            }
            else{
                i++;
            }
        }
        
        return arr;
    }
    public int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
       int sum = 0,count=0;
    //Your code here
    for(int i = 0 ; i< N ; i++){
        if(arr[i]==0)arr[i]=-1;
    }
    
    for(int i = 0 ; i < N ; i++){
        for(int j  = i ; j < N ; j ++){
            sum+=arr[j];
            if(sum==0)count++;
        }
        // sum=0;
    }
    return count;
    }
    
}
public class neg_pos{
    public static void main(String[] args){
        int[] arr = {0,0,1,1,0};
        neg_pos1 t_obj = new neg_pos1();
        // int[] ans=t_obj.zero_one(arr);
        // for(int i : ans){
        //     System.out.print(i+" ");
        // }
        int ans = t_obj.countSubarrWithEqualZeroAndOne(arr, 5);
           System.out.print(ans);
    }
    }