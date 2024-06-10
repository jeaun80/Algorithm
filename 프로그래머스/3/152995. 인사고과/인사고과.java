import java.util.*;

class Solution {
    public int solution(int[][] scores) {
        int answer = 0;
        int answerA = scores[0][0];
        int answerB = scores[0][1];
        
        Arrays.sort(scores,new Comparator<int[]>(){
            
            @Override
            public int compare(int o1[],int o2[]){
                if(o2[0]==o1[0]){
                    return o1[1]-o2[1];
                }
                return o2[0]-o1[0];
            }
        });
        int maxA = scores[0][0];
        int maxB = scores[0][1];
        Queue<grade> que =new PriorityQueue<>(new Comparator<grade>(){
            
            @Override
            public int compare(grade o1,grade o2){
                
                return o2.sum-o1.sum;
            }
        });
        que.add(new grade(scores[0][0],scores[0][1]));
        for(int i=1;i<scores.length;i++){
            
            if(maxB<=scores[i][1]){
                // maxA = scores[i][0];
                maxB = scores[i][1];
                que.add(new grade(scores[i][0],scores[i][1]));
            }
            else if(maxB>scores[i][1]){
                if(maxA==scores[i][0]){//앞에는 같고 뒤에는 작은경우
                    que.add(new grade(scores[i][0],scores[i][1]));
                }
                else{//둘다 작은경우 아무짓도 하지않는다.
                    if(scores[i][0]==answerA && scores[i][1]==answerB){
                        return -1;
                    }
                    
                }
            }
        }
        
        int size = que.size();
        int ranking =1;
        int preSum =0;
        for(int i=0;i<size;i++){
            grade g = que.poll();
            if(g.sum>answerA+answerB){
                ranking++;
            }
            else{
                break;
            }
        }
        return ranking;
    }
    
     public class grade {
        
        int a;
        int b;
        int sum;
        public grade(int a,int b){
            this.a= a;
            this.b= b;
            this.sum = a+b;
        }
    }
}