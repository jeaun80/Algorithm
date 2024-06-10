import java.util.*;

class Solution {
    
    static Map<String,String> map;
    static Map<String,Integer> valueMap;

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        
        
        int[] answer = new int[enroll.length];
        //init
        map = new HashMap<>();
        valueMap = new HashMap<>();
        for(int i=0;i<enroll.length;i++){
            map.put(enroll[i],referral[i]);
            valueMap.put(enroll[i],0);
        }
        
        //계산
        
        for(int i=0;i<seller.length;i++){
            
            int value = amount[i]*100;
            String sel = seller[i];
            while(!sel.equals("-")){
                int nextVal=0;
                if(value>=10){
                    nextVal = value/10;
                    
                    value -=nextVal;
                }
                else{
                    valueMap.put(sel,valueMap.getOrDefault(sel,0)+value);
                    break;
                }
                
                valueMap.put(sel,valueMap.getOrDefault(sel,0)+value);
                sel = map.get(sel);
                value = nextVal;
            }
        }        
        for(int i=0;i<enroll.length;i++){
            answer[i] = valueMap.get(enroll[i]);
        }
        return answer;
    }
}