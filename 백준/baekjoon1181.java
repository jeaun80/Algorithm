import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class baekjoon1181 {
    public static void main(String[]args) throws Exception{


        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.valueOf(br.readLine());


        String a[]=new String[count];
        for(int i=0;i<count;i++){
            a[i]= br.readLine();
        }
        Arrays.stream(a).sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).distinct().forEach(System.out::println);



    }
}
