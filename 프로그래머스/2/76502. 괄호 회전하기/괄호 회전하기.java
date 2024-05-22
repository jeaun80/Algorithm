import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int size = s.length();
        for(int i =0;i<size;i++){
            
            String changeStr;
            String firstStr = s.substring(i,size);
            String secStr = s.substring(0,i);
            changeStr= firstStr+secStr;
            if(check(changeStr)){
                answer++;
            }
            
        }
        return answer;
    }
    
    public static boolean check(String s){
        Stack<String>stack = new Stack<>();
        
        if(s.charAt(0) != '{' && s.charAt(0) != '[' && s.charAt(0)!='('){
            return false;
        }
        stack.add(s.substring(0,1));
        int i = 1;
        while(true){
            if(i==s.length()){
                break;
            }
            String ss = s.substring(i,i+1);
            if(ss.equals("[") || ss.equals("{") || ss.equals("(")){
                stack.add(ss);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                String curS = stack.peek();
                if(ss.equals("]")){
                    if(curS.equals("[")){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                
                if(ss.equals("}")){
                    if(curS.equals("{")){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                
                if(ss.equals(")")){
                    if(curS.equals("(")){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            i++;
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}