import java.io.*;
import java.util.StringTokenizer;

public class baekjoon15552 {

    public static void main(String[]args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));

        int count= Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<count;i++){
            String[] a=bufferedReader.readLine().split(" ");
            int sum=Integer.parseInt(a[0]);
            sum+=Integer.parseInt(a[1]);
            bufferedWriter.append((String.valueOf(sum))+"\n");

        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
