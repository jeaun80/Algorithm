import java.io.*;
import java.util.Stack;

public class beakjoon9935 {
    public static void main(String[]args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String context=br.readLine();
        String boom = br.readLine();


        Stack<Character> contextSt = new Stack<>();

        for(int i=0;i<context.length();i++){
            contextSt.push(context.charAt(i));

            if(contextSt.size()>=boom.length()){
                boolean flag= true;
                for(int j = 0;j<boom.length();j++){
                    if(contextSt.get(contextSt.size()-boom.length()+j) != boom.charAt(j)){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0;j<boom.length();j++)
                        contextSt.pop();
                }

            }

        }

        StringBuilder sb = new StringBuilder();
        for(Character c : contextSt) {
            sb.append(c);
        }
        System.out.println(sb.length()==0? "FRULA" : sb.toString());



    }
}
