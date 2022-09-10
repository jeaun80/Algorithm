import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon1715 {
    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pack = new PriorityQueue<>();
        for(int i=0;i<count;i++){
            pack.add(Integer.parseInt(br.readLine()));
        }

        int max=0;
        while(pack.size()>1){
            int a= pack.poll();
            int b = pack.poll();
            max+=a+b;
            pack.add(a+b);
        }
        System.out.println(max);
    }

}
