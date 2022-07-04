import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon1753 {

    static int miro[][];
    static int start;
    static int v;
    static int visit[];
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        v= scan.nextInt();
        int e= scan.nextInt();
        start= scan.nextInt();
        miro=new int[v+1][v+1];
        visit=new int[v+1];
        visit[start]=0;
        for(int i=1;i<=e;i++){
            int v1=scan.nextInt();
            int v2=scan.nextInt();
            int w=scan.nextInt();
            miro[v1][v2]=w;
        }



        for(int i=1;i<=v;i++){
            for(int j=1;j<=v;j++){
                System.out.print(miro[i][j]);
            }
            System.out.println();
        }
        bfs();

        for(int i=1;i<visit.length;i++){
            if(i!=start && visit[i]==0){
                System.out.println("INF");
                continue;
            }
            System.out.println(visit[i]);
        }
    }
    public static void bfs(){
        Queue<point> que = new LinkedList<>();

        for(int i=1;i<=v;i++){
            if(miro[start][i]!=0){
                que.add(new point(start,i));
                visit[i]=miro[start][i];
            }
        }
        while(!que.isEmpty()){
            point work=que.poll();

            int v1=work.x;
            int v2=work.y;
            for(int i=0;i<=v;i++){
                if(miro[v2][i]!=0){
                    que.add(new point(v2,i));
                    miro[v2][i]+=miro[v1][v2];
                    if(visit[i]==0){
                        visit[i]=miro[v2][i];
                    }
                    else if(visit[i]>=miro[v2][i]){
                        visit[i]=miro[v2][i];
                    }
                }
            }
        }

    }


}

class point{
    int x;
    int y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
/*
bfs 탐색을 이용하는데

일단 처음시작 정점에서 x좌표로 전부 큐에넣고 visit에도 다넣는다.
그리고 큐에넣은거 뺀다 빼면서 좌표값을 저장한다.
그래서 그 좌표에서 다시 가는거 즉 1,2 좌표가 처음 큐에 들어갈경우
1,2를 빼면서
[2][i]를 큐에 넣는다. 그리고 현재 1,2좌표값+[2][i]좌표값더하기해서가 아니라 [2][i]+=[1][2]하고 visit[i]값 작은경우 삽입
visit[]의 값이0일경우 무조건 넣는다.

이행를 큐가 빌때까지 반복한다.(너비탐색으로 끝까지 간다. 근데?)
생각해보니 직행할대는 2+4라서 괜찮은데 3번경유할경우 2,3,번째 가중치만 더하게 된다.
처음시작 정점에서 연결된 정점들을 큐에넣고 큐에빼면서 정점위치의 y좌표 즉
 */