import java.util.*;
class Solution {
    
    static int cardArr[];
    static boolean visit[];
    public int solution(int[] cards) {
        int answer = 0;
        int groupSize = 0;
        cardArr = cards;
        for(int i=0;i<cards.length;i++){
            cards[i]--;
        }
        for(int i=0;i<cards.length;i++){
            
            int[]boxArr = openBox(i); 
            if(boxArr.length>groupSize){
                // System.out.println("boxsize = "+boxArr.length);
                groupSize = boxArr.length;
                visit = new boolean[cards.length];
                for(int j=0;j<boxArr.length;j++){
                    visit[boxArr[j]] = true;
                }
            }
        }
        // System.out.println("finla boxsize = "+groupSize);
        
        int firstSize = groupSize;
        groupSize = 0;
        boolean visittow[];
        for(int i=0;i<cards.length;i++){
            if(visit[i]){
               continue; 
            }
            int[]boxArr = openBox(i);   
            if(boxArr.length>groupSize){
                groupSize = boxArr.length;
                visittow = new boolean[cards.length];
                for(int j=0;j<boxArr.length;j++){
                    visittow[boxArr[j]] = true;
                }
            }
        }
        answer = firstSize* groupSize;
        // System.out.println(firstSize+" "+groupSize);
        return answer;
    }
    
    public int[] openBox(int i){
        Set<Integer>set = new HashSet<>();
        int size = 0;
        int[]result;
        int index =0;
        while(true){
            int cardVal = cardArr[i];
            if(!set.contains(cardVal)){
                set.add(cardVal);
                i = cardVal;
            }else{
                size = set.size();
                break;
            }
        }
        result = new int[size];
        for(int s: set){
            result[index++] = s;
        }
        return result;
        
    }
}