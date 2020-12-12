import java.util.*;
public class mazepath_eight_direction {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int sc = scn.nextInt();
        int sr = scn.nextInt();
        int ec = scn.nextInt();
        int er = scn.nextInt();
        boolean[][] visited = new boolean[er+1][ec+1];
        String path = "";

        mazepath(sc , sr, ec,er,path,visited);
      
    }
    static int counter =0 ;
    public static void mazepath(int sc , int sr , int ec , int er , String path , boolean[][] visited){

        if(sc == ec && sr==er){
            counter++;
            System.out.println(counter+"."+path);
            return ;
        }


        visited[sr][sc]=true;
        if (sc+1<=ec && visited[sr][sc+1]!=true){             //right   R
            mazepath(sc+1 , sr, ec,er,path+"R",visited);

        }
        if (sc+1<=ec && sr-1>=0 && visited[sr-1][sc+1]!=true){      // up right UR
            mazepath(sc+1 , sr-1, ec,er,path+"ur",visited);
        }

        if (sr-1>=0 && visited[sr-1][sc]!=true){                 // up   U
            mazepath(sc , sr-1, ec,er,path+"U",visited);
        }

        if (sc-1>=0 && sr-1>=0 && visited[sr-1][sc-1]!=true){      // up left UL
            mazepath(sc-1 , sr-1, ec,er,path+"ul",visited);
        }
        if (sc-1>=0 && visited[sr][sc-1]!=true){                //left L
            mazepath(sc-1 , sr, ec,er,path+"L",visited);
        }

        if (sc-1>=0 && sr+1<=er && visited[sr+1][sc-1]!=true){      // down left DL
            mazepath(sc-1 , sr+1, ec,er,path+"dl",visited);

        }
        if (sr+1<=ec && visited[sr+1][sc]!=true){             //down   D
            mazepath(sc , sr+1, ec,er,path+"D",visited);
        }

        if (sc+1<=ec && sr+1<=er && visited[sr+1][sc+1]!=true){      // down right DR
            mazepath(sc+1 , sr+1, ec,er,path+"dr",visited);
        }

        visited[sr][sc]=false;
            
    }
    
}