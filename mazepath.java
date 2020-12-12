public class mazepath {
    public static void main(String[] args){
       int  ans=maze_path(0,0,2,2,"");
        System.out.println(ans);    
    }

    
    public static int maze_path(int sr,int sc , int er , int ec, String ans){
        if (sr==er && sc==ec){
            System.out.println(ans);
            return 1;
        }
        int count =0;
        if (sc+1<=ec){
            count += maze_path(sr,sc+1 , er ,ec, ans+"H");
        }
        if (sr+1<=er){
            count += maze_path(sr+1,sc , er ,ec, ans+"v");
        }
        if (sc+1<=ec && sr+1<= er){
            count += maze_path(sr+1,sc+1 , er ,ec, ans+"D");
        }
        return count;
    }
}
