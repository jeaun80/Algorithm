import java.util.*;
class Solution {
    
    public String[] jeague(String p){
        
        
        int left = 0;
        int right = 0;
        String[] answer = new String[2];
        
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='('){
                left++;
            }
            if(p.charAt(i)==')'){
                right++;
            }
            if(left>0 && right>0 && left==right){
                answer[0] = p.substring(0,i+1);
                answer[1] = p.substring(i+1,p.length());
                return answer;
            }
        }
        return answer;
    }
    public boolean allbarn(String p){
        Stack<String> stack = new Stack<>();
        boolean answer = false;
        boolean no = false;
        for(int i=0;i<p.length();i++){
            char pc = p.charAt(i);
            if(pc=='('){
                stack.add(String.valueOf(pc));
            }
            if(pc==')'){
                if(stack.isEmpty()){
                    answer = false;
                    no = true;
                    break;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty() && !no){
            answer = true;
        }
        return answer;
    }
    
    public String fuck(String p){
        
        if(p.equals("")){
            return p;
        }
        String stArr[] = jeague(p);
        String u = stArr[0];
        String v = stArr[1];
        System.out.println(u+" "+v);
        boolean uresult = allbarn(u);
        if(uresult){
            return u+fuck(v);
        }
        else{
            return "("+fuck(v)+")"+reverse(u);
        }
    }
    public String reverse(String p){
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<p.length()-1;i++){
            String s = "(";
            if(p.charAt(i)=='('){
                s = ")";
            }
            sb.append(s);
        }
        return String.valueOf(sb);
    }
    public String solution(String p) {
        String answer = "";
        
        answer = fuck(p);
        
        //p의 분리 
        //u와 v로 분리는 최초로 각자의()의 갯수가 동일하며 0이아닐때로 분류한다.
        //이는 재귀로 계속해서 사용해야하기 때문에. String 파라미터를 가진 함수로 구현하여 활용토록한다.
        
        //올바른괄호문자열인지 검사함수도 작성한다
        //Stack을 사용하여 (일경우 add, )일경우 pop을 사용해 최종적으로 stack의 사이즈가 0이면 올바른, 아니면 올바르지않은 으로 truefalse로 반환한다. 
        //u가 false일 경우 빈문자열empStr ( 생성 후 v를 분리 -> 올바른확인 후 empStr에 이어붙인다. 이후 )를 붙이고 u
        //입력이 빈문자열일 경우 빈문자열 반환
        
        //v를 재귀 했을대
        //v를 u와 v로 분리 , u가 올바르면 v다시수행
        //
        return answer;
    }
}