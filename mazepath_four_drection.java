
import java.util.*;
public class mazepath_four_drection {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int sr = scn.nextInt();
        int sc = scn.nextInt();
        int er = scn.nextInt();
        int ec = scn.nextInt();
        String path = "";
        boolean[][] visited = new boolean[er+1][ec+1];
        

        mazepath(sr,sc,er,ec,path,visited);

    }
     static int count=0;
    public static void mazepath(int sr, int sc, int er , int ec , String path,boolean[][] visited){
        if (sc==ec && sr==er){
            count++;
            System.out.println(count+"."+path);
            return ;
        }
        
        visited[sr][sc]=true;
        if(sc+1<=ec && !visited[sr][sc+1]){
            mazepath(sr,sc+1,er,ec,path+"R",visited);

        }
        if(sr+1<=er && !visited[sr+1][sc]){
            mazepath(sr+1,sc,er,ec,path+"D",visited);

        }
        if (sc-1>=0 && !visited[sr][sc-1]){
            mazepath(sr,sc-1,er,ec,path+"L",visited);
        }

        if (sr-1>=0 && !visited[sr-1][sc]){
            mazepath(sr-1,sc,er,ec,path+"U",visited);

        }

        visited[sr][sc]=false;
   

    }
}