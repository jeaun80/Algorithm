import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class back9012 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int num = scan.nextInt();
        int parm = 0;
        String commend;
        for (int i = 0; i < num; i++) {
            Stack<String> stack = new Stack<>();
            commend = scan.next();
            String a[] = commend.split("");
            int b=0;
            for (int j = 0; j < a.length; j++) {
                if (a[j].equals("(")) {
                    stack.push(a[j]);
                }
                else if(stack.empty()){
                    b=1;
                    System.out.println("NO");
                    break;
                }
                // 그 외의 경우 stack 원소를 pop 한다.
                else {
                    stack.pop();
                }
            }
            if(b==0){
                if(stack.empty()){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}

