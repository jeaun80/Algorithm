class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        boolean visited[] = new boolean[30901000];
        for(int i=0;i<arr.length;i++){
            
            int current = arr[i];
            
            for(int j=1;j<visited.length;j++){
                if(visited[j]){
                    continue;
                }
                if(j%current!=0 || j<current){
                    visited[j]=true;
                }
            }
        }
        for(int i=1;i<visited.length;i++){
            if(!visited[i]){
                answer = i;
                break;
            }
        }
        return answer;
    }
}