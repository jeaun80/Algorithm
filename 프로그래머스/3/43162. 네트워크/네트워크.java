class Solution {
    
    static boolean[][] visited;
    static int m;
    public int solution(int n, int[][] computers) {
        
        visited = new boolean[computers.length][computers[0].length];
        int answer = 0;
        m = n;
        
        for(int i=0;i<computers.length;i++){
            int num = 0;
            for(int j=0;j<computers[i].length;j++){
                if(computers[i][j] ==1){
                    num++;
                }
                if(computers[i][j]==1 && !visited[i][j]){
                    // visited[i][j] = true;
                    // visited[j][i] = true;
                    if(i==j){
                        continue;
                    }
                    answer++;
                    // System.out.println("i = "+i+" j = "+j);
                    dfs(i,j,computers);
                }
                
                // for(int ii=0;ii<computers.length;ii++){
                //     for(int jj=0;jj<computers[ii].length;jj++){
                //         System.out.print(visited[ii][jj]+" ");
                //     }
                // System.out.println();
                // }
                // System.out.println();
                
            }
            if(num==1){
                answer++;
            }
            
        }
        
        
        // System.out.println(answer);
        return answer;
    }
    
    public void dfs(int a,int b,int[][]computers){
        
        for(int i = 0;i<computers[0].length;i++){
            // if(a==i){
            //     continue;
            // }
            
            // if(a==1){
            //     System.out.println("fhdiasf");
            // }
            if(computers[a][i]==1 && !visited[a][i]){
                visited[a][i] = true;
                visited[i][a] = true;
                dfs(i,0,computers);
            }
        }
        
    }
}