import java.util.*;
class Solution {
    int visit[];

    public int solution(int n, int[][] costs) {
        int answer = 0;
        int graph[][] = new int[n][n];
        visit = new int[n];
        
        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[]b){
                return a[2]-b[2];
            }
        });
        
        for(int i =0;i<visit.length;i++){
            visit[i] = i;
        }
        //점하나 잡고 가장 작은 선 연결 - 비짓트루 - 비용플러스
        //find unionfind 전략 - 각각 파인드해서 다른부모를 가지고있으면 둘이 합친다 유니온으로
        for(int i=0;i<costs.length;i++){
            
            
            if(find(costs[i][0])!=find(costs[i][1])){
                union(costs[i][0],costs[i][1]);
                answer += costs[i][2];
            }
        }
               
        return answer;
    }
    public int find(int a){
        
        if(visit[a] == a){
            return a;
        }
        else{
            return visit[a] = find(visit[a]);
        }
        
    }
    
    public void union(int a,int b){
        int x = find(a);
        int y = find(b);
        if(x!=y){
            visit[y] = x;
        }
    }
}