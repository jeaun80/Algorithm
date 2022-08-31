import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class baekjoon4949 {
    public static void main(String[]args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String a= br.readLine();
            if(a.equals(".")){
                break;
            }
            String ab[]=new String[a.length()];
            for(int i=0;i<a.length();i++){
                ab[i]=String.valueOf(a.charAt(i));
            }
            Stack<String> stack=new Stack<>();

            for(int i=0;i<a.length();i++){
                if(ab[i].equals("[")){
                    stack.push(ab[i]);
                }
                if(ab[i].equals("(")){
                    stack.push(ab[i]);
                }

                if(ab[i].equals("]")){
                    if(stack.isEmpty()){
                        stack.push("1");
                        break;
                    }
                    if(stack.peek().equals("[")){
                        stack.pop();
                    }
                    else{
                        break;
                    }
                }
                if(ab[i].equals(")")){
                    if(stack.isEmpty()){
                        stack.push("1");
                        break;
                    }
                    else if(stack.peek().equals("(")){
                        stack.pop();
                    }
                    else{
                        break;
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("yes");
                stack.empty();
            }
            else{
                System.out.println("no");
                stack.empty();
            }
        }

    }
}
