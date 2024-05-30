import java.util.*;

class Solution {
    static List<List<Integer>> graph;
    static int visit[];
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        
        
        //정제
        
        //bfs를 사용할수 있도록 이차원배열을 통해 그래프생성(ㅂquque사용)
        //양방향사용
        //destination 부터 bfs로 방문하면서 최소거리 체크
        //후 소스에있는 거에 적힌 최소거리를 result로 반환
        // 반환할때 안되는건 -1로 변환
        int[] answer = new int[sources.length];
        
        visit = new int[n+1];
        Queue<Integer> que = new LinkedList<>();
        graph = new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i =0;i<roads.length;i++){
            int startRoad = roads[i][0];
            int endRoad = roads[i][1];
            
            graph.get(startRoad).add(endRoad);
            graph.get(endRoad).add(startRoad);
        }
        que.add(destination);
        visit[destination] = 0;
        
        while(!que.isEmpty()){
            int a  = que.poll();
            List<Integer> list = graph.get(a);
            
            for(int i=0;i<list.size();i++){
                int nexta = list.get(i);
                
                if(visit[nexta]==0 && nexta!=destination){                    
                    que.add(nexta);  
                    visit[nexta] = visit[a]+1;
                }
            }
            
            
        }
        
        for(int i=0;i<sources.length;i++){
            
            answer[i] = visit[sources[i]];
            if(visit[sources[i]]==0 && sources[i] != destination){
                answer[i] = -1;
            }
        }
        return answer;
    }
}