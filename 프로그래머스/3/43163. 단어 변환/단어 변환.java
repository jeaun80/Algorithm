import java.util.*;
class Solution {
    
    // static final int 
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Map<String,Integer>visit = new HashMap<>();
        for(String s : words){
            visit.put(s,0);
        }
        
        //words 안에 target이 있냐없냐 타맥후 없으면 return 0;
        
        //bfs 사용
        
        //조건
        
        //하나의 단어만 다른지 안다른지를 함수화 해서 하나만다른게 맞아서 true반환이 확인되면 bfs큐에 삽입
        boolean flag = false;
        for(int i=0;i<words.length;i++){
            if(target.equals(words[i])){
                flag = true;
            }
        }
        if(flag){
            flag = false;
        }
        else{
            return 0;
        }
        Queue<String>que = new LinkedList<>();
        Queue<Integer>depthQue = new LinkedList<>();
        depthQue.add(0);
        que.add(begin);
        visit.put(begin,0);
        while(!que.isEmpty()){
            String curWord = que.poll();
            int depth = depthQue.poll();
            
            if(target.equals(curWord)){
                answer = depth;
                break;
                
            }
            for(int i=0;i<words.length;i++){
                int checkResult = 0;
                if(visit.get(words[i])==0){
                    checkResult = checkWord(curWord,words[i]); 
                }
                if(checkResult==1){
                    que.add(words[i]);
                    visit.put(words[i],1);
                    depthQue.add(depth+1);
                }
            }
            
        }
        
        return answer;
    }
    
    public int checkWord(String curWord,String compareWord){
        int comapareValue= 0;
        for(int i=0;i<curWord.length();i++){
            if(curWord.charAt(i)!=compareWord.charAt(i)){
                comapareValue++;
            }
        }
        
        int result =0;
        if(comapareValue>1){
            result = 0;
        }
        else if(comapareValue==1){
            result = 1;
        }
        else if(comapareValue==0){
            result = 2;
        }
        return result;
    }
}