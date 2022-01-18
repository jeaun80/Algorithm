import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class back10828 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack=new Stack<>();

        int num= Integer.parseInt(br.readLine());
        int parm;

        for(int i=0;i<num;i++){
            String commend= br.readLine();
            if(commend.contains("push")){
                String value[] = commend.split(" ");
                stack.push(Integer.parseInt(value[1]));
            }
            else if(commend.equals("pop")){
                if(!stack.isEmpty()){
                    bw.write(stack.pop()+"\n");
                }
                else{
                    bw.write(-1+"\n");
                }
            }
            else if(commend.equals("size")){
                bw.write(stack.size()+"\n");
            }
            else if(commend.equals("empty")){
                if(!stack.isEmpty()){
                    bw.write(0+"\n");
                }
                else{bw.write(1+"\n");}
            }
            else if(commend.equals("top")){
                if(!stack.isEmpty()){
                    bw.write(stack.peek()+"\n");
                }
                else{bw.write(-1+"\n");}
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
