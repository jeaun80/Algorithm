import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon1260 {
    static int[][] que=new int[1500][1500];
    static int v;
    static int m;
    static int start;
    static int[] visit=new int[1500];
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        v=scan.nextInt();
        m=scan.nextInt();
        start=scan.nextInt();
        for(int i=0;i<m;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            que[a][b]=1;
            que[b][a]=1;
        }
        dfs(start);
        for(int i=0;i<visit.length;i++){
            visit[i]=0;
        }
        System.out.print("\n");
        bfs(start);
    }

    public static void dfs(int s){
        System.out.print(s+" ");
        visit[s]=1; 
        for(int i=1;i<=v;i++){
            if(visit[i]==1 || que[s][i]==0)
                continue;
            dfs(i);
        }
    }
    public static void bfs(int s){
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visit[s]=1;
        while(!q.isEmpty()){
            int w=q.poll();
            System.out.print(w+" ");
            for(int i=1;i<=v;i++){
                if(visit[i]==0 && que[w][i]==1){
                    visit[i]=1;
                    q.offer(i);
                }
            }
        }
    }

}
