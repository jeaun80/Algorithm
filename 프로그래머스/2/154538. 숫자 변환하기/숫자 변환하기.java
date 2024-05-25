import java.util.*;
class Solution {
    static Queue<int[]>que;
    static int m;
    static int answer;
    public int solution(int x, int y, int n) {
        
        
        que = new LinkedList<>();
        que.add(new int[]{y,0});
        m = n;
        
        answer =0;
        bfs(x,y);
        if(answer==0 && x!=y){
            answer = -1;
        }
        return answer;
    }
    
    
    public static void bfs(int x,int y){
        
        
        while(!que.isEmpty()){
            
            int[] curvArr = que.poll();
            int curv = curvArr[0];
            int depth = curvArr[1];
            if(curv==x){
                answer = depth;
                return;
            }
            int av,bv,cv;
            if(curv%2 ==0 && curv/2>=x){
                av = curv/2;
                que.add(new int[]{av,depth+1});
                
            }
            if(curv%3==0 && curv/3>=x){
                bv = curv/3;
                que.add(new int[]{bv,depth+1});
                
            }
            if(curv-m>=x){
                cv = curv-m;
                que.add(new int[]{cv,depth+1});
            }
        }
        
    }
}