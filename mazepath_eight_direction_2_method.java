import java.util.*;
public class mazepath_eight_direction_2_method {

    static int[][] dirA={{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1}};
    static String [] root = {"R","uR","U","uL","L","dL","D","dR"};
    public static int mazepath(int sc , int sr ,int ec, int er,String path,boolean[][] visited){
        if(sr==er && sc==ec){
        
            System.out.println(path);
            return 1;
        }
        visited[sr][sc]=true;
        int count=0;
        for(int  i =0;i<8;i++){
            int x = sr+dirA[i][0];
            int y = sc+dirA[i][1];

            if (x>=0 && y>=0 && x<=er && y<=ec && !visited[x][y]){
                count+=mazepath(y, x,ec,er,path+root[i],visited);
            }
            
        }

        visited[sr][sc]=false;
        return count;

    }
    public static void main(String[] args){
         
        Scanner scn = new Scanner(System.in);

        

        int sc= scn.nextInt();
        int sr= scn.nextInt();
        int ec= scn.nextInt();
        int er= scn.nextInt();

        String path="";

        boolean[][] visited = new boolean[er+1][ec+1];

        int ans=mazepath(sc, sr,ec,er,path,visited);
        System.out.println(ans);

    }

   
    
}