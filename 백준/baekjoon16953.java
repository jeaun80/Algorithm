import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon16953 {
    public static void main(String[]args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String context = br.readLine();

        String[] contextList =context.split(" ");
        int A=Integer.parseInt(contextList[0]);
        int B=Integer.parseInt(contextList[1]);
        int count =0;

        while(A<B){
            if(B%2==0){
                B/=2;
                count++;
            }
            else{
                String stringB= String.valueOf(B);
                String rastStringB = stringB.substring(stringB.length()-1,stringB.length());
                if(rastStringB.equals("1")){
                    stringB=stringB.substring(0,stringB.length()-1);
                    count++;
                    B=Integer.parseInt(stringB);
                }
                else{
                    break;
                }

            }
        }

        if(A==B){
            System.out.println(count+1);
        }
        else{
            System.out.println(-1);
        }
    }
}
