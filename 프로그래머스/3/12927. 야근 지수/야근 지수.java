import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i: works){
            que.add(i);
        }
        for(int i=0;i<n;i++){
            
            int p = que.poll();
            if(p==0){
                break;
            }
            que.add(p-1);
        }
        
        for(int i:que){
            // System.out.println(i);
            answer+=Long.valueOf(i*i);
        }
        return answer;
    }
}