import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];

        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();        
        for(int i=0;i<gems.length;i++){
            // map.put(gems[i],map.getOrDefault(gems[i],0)+1);
            set.add(gems[i]);
        }
        int gemSize = set.size();
        
        int start=0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        
        for(int i=0;i<gems.length;i++){
            map.put(gems[i],map.getOrDefault(gems[i],0)+1);
            
            while(map.get(gems[start])>1){
                map.put(gems[start],map.get(gems[start])-1);
                start++;
            }
            if(map.size()==gemSize && minLen>i-start){
                minLen = i-start;
                answer[0] = start+1;
                answer[1] = i+1;
            }
        }
        
        
        return answer;
    }
}