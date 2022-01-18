import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class back10773 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack=new Stack<>();

        int num= Integer.parseInt(br.readLine());
        int parm=0;

        for(int i=0;i<num;i++){
            String commend= br.readLine();
            if(commend.equals("0")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(commend));
            }
        }
        for(int i=0;i<stack.size();i++){
            parm+=stack.get(i);
        }
        System.out.print(parm);
        bw.flush();
        bw.close();
        br.close();
    }
}
