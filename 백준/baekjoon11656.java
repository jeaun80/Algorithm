import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class baekjoon11656 {
    public static void main(String[]args) throws Exception{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String a= br.readLine();

        List<String> abs= new ArrayList<>();
        String[] ab=new String[a.length()];
        for(int i=0;i<a.length();i++){
            abs.add(a.substring(i,a.length()));
        }
        abs.stream().sorted(Comparator.comparing(String::toString)).forEach(System.out::println);
    }
}
