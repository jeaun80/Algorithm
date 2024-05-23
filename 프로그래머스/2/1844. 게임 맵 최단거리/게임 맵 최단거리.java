import java.util.*;

class Solution {
    static boolean visited[][];
    static int mxArr[] = {-1,1,0,0};
    static int myArr[] = {0,0,-1,1};
    static int finalx;
    static int finaly;
    static int answer;
    static int[][] map;
    public int solution(int[][] maps) {
        // int answer = 0;
        visited = new boolean[maps.length][maps[0].length];
        map = maps;
        answer = Integer.MAX_VALUE;
        finalx = maps.length-1;
        finaly = maps[0].length-1;
        visited[0][0] = true;
        
        
        //bfs
        Queue<Can>que = new LinkedList<>();
        
        que.add(new Can(0,0,1));
        
        while(!que.isEmpty()){
            Can can = que.poll();
            if(can.x==finalx && can.y ==finaly){
                answer = map[can.x][can.y];
                break;
            }
            visited[can.x][can.y] = true;
            for(int i=0;i<4;i++){
                int dx = mxArr[i]+can.x;
                int dy = myArr[i]+can.y;
                if(dx>=0 && dx<map.length && dy >=0 && dy<map[0].length){
                    if(map[dx][dy]==1 && !visited[dx][dy]){
                        if(map[dx][dy]>=2){
                            map[dx][dy] = Math.min(can.depth+1,map[dx][dy]);
                        }else{
                            map[dx][dy] = can.depth+1;
                            
                        }
                        que.add(new Can(dx,dy,map[dx][dy]));
                    }
                }
            }
            
        }
        if(answer==Integer.MAX_VALUE){
            answer = -1;
        }
        return answer;
    }
    
    
    public class Can{
        int x;
        int y;
        int depth;
        public Can(int x,int y ,int depth){
            this.x = x;
            this.y = y;
            this.depth = depth;
        }
    }
}