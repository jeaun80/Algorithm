import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon5525 {
    public static void main(String []args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.valueOf(br.readLine());

        int m = Integer.valueOf(br.readLine());

        String context = br.readLine();
        StringBuilder ab=new StringBuilder();
        ab.append("I");
        int count =0;
        for(int i=0;i<n;i++){
            ab.append("OI");
        }
        for(int i=0;i<context.length()-2*n;i++){
            if(2*n+i+1<=m){
                String abc= context.substring(i,2*n+i+1);
                if(abc.equals(ab.toString())){
                    count++;
                    i++;
                }
            }
        }

        System.out.println(count);

    }
}
