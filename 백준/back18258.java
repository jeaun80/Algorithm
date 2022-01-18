import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class back18258 {
    public static void main(String[] arags) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String num= br.readLine();
        LinkedList<Integer> que=new LinkedList<>();

        //push pop size empty front back
        for(int i=0;i<Integer.parseInt(num);i++){
            String commend=br.readLine();
            String com[]=commend.split(" ");
            if(com[0].equals("push")){
                que.offer(Integer.parseInt(com[1]));
            }
            else if(com[0].equals("pop")){
                if(que.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else{
                    sb.append(que.poll()).append('\n');

                }
            }
            else if(com[0].equals("size")){
                sb.append(que.size()).append('\n');
            }
            else if(com[0].equals("empty")){
                if(que.isEmpty()){
                    sb.append(1).append('\n');
                }
                else{
                    sb.append(0).append('\n');
                }
            }
            else if(com[0].equals("front")){
                if(que.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else{
                    sb.append(que.peek()).append('\n');
                }
            }
            else if(com[0].equals("back")){
                if(que.isEmpty()){
                    sb.append(-1).append('\n');
                }
                else{
                    sb.append(que.peekLast()).append('\n');
                }
            }
        }


    }
}
