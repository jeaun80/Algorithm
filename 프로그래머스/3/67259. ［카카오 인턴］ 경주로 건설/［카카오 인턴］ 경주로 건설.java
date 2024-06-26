import java.util.*;
class Solution {
    static int dirx[] = {0,1,0,-1};
    static int diry[] = {1,0,-1,0};
    static int[][] map;
    static int result = Integer.MAX_VALUE;
    public static class node{
        int x;
        int y;
        node preNode;
        int val;
        
        public node(int x, int y,node preNode,int val){
            this.x = x;
            this.y = y;
            this.preNode = preNode;
            this.val = val;
        }
    }
    public static void bfs(int[][]board,int n){
        
        
        Queue<node> que = new LinkedList<>();
        que.add(new node(0,0,null,0));
        while(!que.isEmpty()){
            node no = que.poll();
            if(no.x==n-1 && no.y == n-1){
                result = Math.min(no.val,result);
            }
            // System.out.println(no.x+" "+no.y+" "+no.dir+" "+no.val);
            
            for(int i=0;i<4;i++){
                
                int dx = no.x + dirx[i];
                int dy = no.y + diry[i];
                if(dx<0 || dx>=n || dy<0 || dy>=n || board[dx][dy]==1){
                    continue;
                }
                
                int dirVal = 100;
                if(no.preNode!=null && no.preNode.x!=dx && no.preNode.y!=dy){
                    dirVal += 500;
                }
                int nextVal = no.val+dirVal;
                
                if(map[dx][dy]>=nextVal){
                    map[dx][dy] = nextVal;
                    que.add(new node(dx,dy,no,nextVal));
                }else if(map[dx][dy]+500>=nextVal){
                    que.add(new node(dx,dy,no,nextVal));
                }
            }
            
        }
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        map = new int[board.length][board.length];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                map[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs(board,board.length);
        return result;
    }
}