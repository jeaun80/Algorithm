import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class baekjoon1427 {
    public static void main(String []args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a= br.readLine();
        String ab[]=new String[a.length()];
        List<String> abc=new ArrayList<>();

        for(int i=0;i<a.length();i++){
            abc.add(String.valueOf(a.charAt(i)));
        }

        abc.stream().sorted(Comparator.comparing(String::valueOf).reversed()).forEach(System.out::print);
    }
}
