import java.util.*;

class Solution {
    static int[]mx = {-1,1,0,0};
    static int[]my = {0,0,1,-1};
    
    public int solution(String dirs) {
        int answer = 0;
        
        
        int[][]map = new int[11][11];
        String[]arg = dirs.split("");
        int x = 5;
        int y = 5;
        List<String>list = new ArrayList<>();
        for(int i=0;i<arg.length;i++){
            int move=0;
            if(arg[i].equals("U")){
                move = 0;
            }
            else if(arg[i].equals("D")){
                move = 1;
                
            }
            else if(arg[i].equals("R")){
                move = 2;
                
            }
            else if(arg[i].equals("L")){
                move = 3;
            }
            
            int dx = x+mx[move];
            int dy = y+my[move];
            if(dx<0 || dy<0 || dx>=11 || dy>=11){
                continue;
            }else{
                
                String tmp = Integer.toString(x)+Integer.toString(y)+Integer.toString(dx)+Integer.toString(dy);
                String tmp1 = Integer.toString(dx)+Integer.toString(dy)+Integer.toString(x)+Integer.toString(y);
                if(list.indexOf(tmp)==-1){ 
                    list.add(tmp);
                    list.add(tmp1);
                    answer++;
                }
                
                x = dx;
                y = dy;
            }
        }
        
        return answer;
    }
}