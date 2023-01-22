import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon2644 {
    static boolean visit[];
    static ArrayList<ArrayList<Integer>> array;
    static int from,answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int person = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        from = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());


        array = new ArrayList<>();

        for(int i=0;i<=person;i++) array.add(new ArrayList<>());
        visit = new boolean[person+1];
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            array.get(a1).add(a2);
            array.get(a2).add(a1);
        }
        dfs(start,0);
        if(answer==0){
            System.out.println( -1);
        }
        else{
            System.out.println(answer);

        }

    }
    public static void dfs(int start,int cnt){
        visit[start] = true;

        for(int x : array.get(start)){
            if(!visit[x]){
                if(x==from){
                    answer=cnt+1;
                    return;
                }
                dfs(x,cnt+1);
            }
        }
    }

}
