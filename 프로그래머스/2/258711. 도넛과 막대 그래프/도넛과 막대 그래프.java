import java.io.*;
import java.util.*;

class Solution {
    
    static Map<Integer,Integer> map = new HashMap<>();
    static Set<Integer> set = new HashSet<>();

    static List<List<Integer>> graph = new ArrayList<>();

    static int startPoint =0;
    static int graphSize = 0; 
    static int[] incommingArr;
    static int graphNum = 0;

    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        
        //1. 시작정점 찾기
        //2. 시작정점부터 순회하여 그래프종류찾기
        
        //1
        //시작,끝
        //시작이 있고 끝이 없는 숫자가 있는게 2개이상일 경우 시작정점이다.
        for(int i[]:edges){
            map.put(i[0],map.getOrDefault(i[0],0)+1);
            map.put(i[1],Integer.MIN_VALUE);
            graphSize = Math.max(graphSize,Math.max(i[0],i[1]));
        }
        
        for(int i=0;i<=graphSize;i++){
            graph.add(new LinkedList<>());
        }
        incommingArr = new int[graphSize+1];

        for(int i[]:edges){
            graph.get(i[0]).add(i[1]);
            incommingArr[i[1]]++;
            
        }
        for(int i: map.keySet()){
            if(map.get(i)>=2){
                startPoint = i;
                graphNum = map.get(i);
                break;
            }
        }
        answer[0] = startPoint;
        //이제 순회한다. 
        
        //막대찾기
        
        int count =0;
        for(int i=1;i<=graphSize;i++){
            if(startPoint==i){
                continue;
            }
            if(graph.get(i).isEmpty() && incommingArr[i]>=1){
                count++;
            }
        }
        answer[2] = count;
        count = 0;
        
        //8자모양 찾기
        
        for(int i=1;i<=graphSize;i++){
            if(graph.get(i).size()==2 &&incommingArr[i]>=2){
                count++;
            }
        }
        answer[3] = count;
        count =0;
        answer[1] = graphNum - (answer[2]+answer[3]);
        return answer;
    }
    
}