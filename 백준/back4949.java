import javax.sound.midi.SysexMessage;
import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class back4949 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String commend= scan.nextLine();

            if(commend.equals(".")) {	// 종료 조건문
                break;
            }
            System.out.println(com(commend));
        }
    }
    public static String com(String commend){
                Stack<String> stack = new Stack<>();
                Stack<String> stackk = new Stack<>();
                String a[] = commend.split("");

                for (int j = 0; j < a.length; j++) {
                    if (a[j].equals("(")) {
                        stack.push(a[j]);
                    }
                    else if(a[j].equals("[")){
                        stackk.push(a[j]);
                    }
                    else if(a[j].equals(")")){
                        stack.pop();
                    }
                    else if(a[j].equals("]")){
                        stackk.pop();
                    }
                    else{

                    }
                }
                if(stack.empty() && stackk.empty()){
                    return "YES";
                }
                else{
                    return "NO";
                }

    }
}


