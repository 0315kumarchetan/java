import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static ArrayList<String> getSubsequenceFunction(String s,int idx){
        if(s.length()==idx){
            ArrayList<String> base  = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(idx);
        ArrayList<String> smallAns =getSubsequenceFunction(s,idx+1);;
        ArrayList<String> myans = new ArrayList<>();  
        for(String  i  : smallAns){
            myans.add(i);
            myans.add(ch+i);
        }
        return myans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
       ArrayList<String> ans = getSubsequenceFunction(s,0);
       System.out.print(ans);
    }
}
