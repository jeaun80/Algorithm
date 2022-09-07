import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class baekjoon14425 {

    public static void main(String[]args)throws IOException {


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nm= br.readLine();
        String[] stringsCount=nm.split(" ");

        int n= Integer.valueOf(stringsCount[0]);
        int m= Integer.valueOf(stringsCount[1]);
        int count =0;
        HashSet<String> savedSet= new HashSet<>();
        for(int i=0;i<n;i++){
            String savedString= br.readLine();
            savedSet.add(savedString);
        }
        for(int i=0;i<m;i++){
            String searchString= br.readLine();
            if(savedSet.contains(searchString)){
                count++;
            }
        }
        bw.append(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
