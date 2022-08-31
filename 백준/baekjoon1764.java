import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class baekjoon1764 {
    public static void main(String[]args) throws Exception{

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a= br.readLine();
        String[] ab= new String[2];
        ab=a.split(" ");

        int nose = Integer.parseInt(ab[0]);
        HashSet<String> noseset = new HashSet<>();
        List<String> nosed = new ArrayList<>();
        int ears = Integer.parseInt(ab[1]);
        List<String> earsd = new ArrayList<>();
        for(int i=0;i<nose;i++){
            noseset.add(br.readLine());
        }
        for(int i=0;i<ears;i++){
            String as= br.readLine();
            if(noseset.contains(as)){
                earsd.add(as);
            }
        }
        nosed.retainAll(earsd);

        earsd.sort(String::compareTo);
        System.out.println(earsd.size());
        for(int i=0;i<earsd.size();i++){
            bw.append(earsd.get(i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}