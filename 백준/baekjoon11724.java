import java.util.Scanner;

public class baekjoon11724 {
    static boolean visit[];
    static int graph[][];
    static int n;
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        n= scan.nextInt();
        int m= scan.nextInt();
        int count=0;
        visit=new boolean[n+1];
        graph=new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int a= scan.nextInt();
            int b= scan.nextInt();
            graph[a][b]=1;
            graph[b][a]=1;
        }
        for(int i=1;i<=n;i++){
            if(visit[i] == false) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }


    public static void dfs(int index){

        if(visit[index] == true)
            return;
        else {
            visit[index] = true;
            for(int i = 1; i <= n; i++) {
                if(graph[index][i] == 1) {
                    dfs(i);
                }
            }
        }


    }
}
