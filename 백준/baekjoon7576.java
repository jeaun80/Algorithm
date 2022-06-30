import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon7576 {

    static int n;
    static int m;
    static int store[][];
    static int dx[]={0,0,-1,1};
    static int dy[]={1,-1,0,0};
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        m= scan.nextInt();
        n=scan.nextInt();
        store=new int[n+1][m+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a= scan.nextInt();
                store[i][j]=a;
            }
        }
        bfs();
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(store[i][j]>=max){
                    max=store[i][j];
                }
                if(store[i][j]==0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(max-1);

    }

    public static void bfs(){
        Queue <int[]> que=new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(store[i][j]==1){
                    que.add(new int[]{i,j});
                }
            }
        }

        while(!que.isEmpty()){
            int xy[]=que.poll();

            for(int i=0;i<4;i++){
                int a=xy[0]+dx[i];
                int b=xy[1]+dy[i];

                if(a<0 || b<0 || a>n-1 || b>m-1){
                    continue;
                }
                if(store[a][b]!=0){
                    continue;
                }
                else{
                    que.add(new int[]{a,b});
                    store[a][b]=store[xy[0]][xy[1]]+1;
                }
            }
        }
    }
}
