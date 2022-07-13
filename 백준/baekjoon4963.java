import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon4963 {

    static int dx[]=new int[]{0,0,-1,1,1,1,-1,-1};
    static int dy[]=new int[]{-1,1,0,0,-1,1,-1,1};
    static int iland[][];
    static boolean visit[][];
    static int startx;
    static int starty;

    static int n=1;
    static int m=1;
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);


        while(n!=0 || m!=0){


            n=scan.nextInt();
            m=scan.nextInt();
            if(n==0 &&m==0){
                break;
            }
            iland=new int[m+1][n+1];
            visit=new boolean[m+1][n+1];

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    iland[i][j]=scan.nextInt();
                }
            }
            int count=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(visit[i][j]==false &&iland[i][j]==1){
                        bfs(i,j);
                        count++;

                    }
                }
            }
            System.out.println(count);







        }
    }
    public static void bfs(int i,int j){
        Queue<int[]> que = new LinkedList<>();

        que.add(new int[]{i,j});
        visit[i][j]=true;
        while(!que.isEmpty()){

            int a[]=que.poll();
            for(int w=0;w<8;w++){
                int ax=dx[w]+a[0];
                int ay=dy[w]+a[1];

                if(ax<0 || ay<0 || ax>m ||ay>n){
                    continue;
                }
                else if(iland[ax][ay]==1 && visit[ax][ay]==false){
                    que.add(new int[]{ax,ay});
                    visit[ax][ay]=true;
                }
            }

        }

    }
}
