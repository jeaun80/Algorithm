import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon2178 {
    static int n;
    static int m;
    static int miro[][];
    static boolean visit[][];
    static int dx[]={0,0,1,-1};
    static int dy[]={1,-1,0,0};
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        n= scan.nextInt();
        m= scan.nextInt();

        miro=new int[n+1][m+1];
        visit=new boolean[n+1][m+1];

        for(int i=0;i<n;i++){
            String a=scan.next();
            for(int j=0;j<m;j++){
                miro[i][j]=a.charAt(j)-'0';
            }
        }
        bfs();
        System.out.print(miro[n-1][m-1]);
    }
    public static void bfs(){
        Queue <int[]> queue=new LinkedList<>();

        int stx=0;
        int sty=0;
        visit[stx][sty]=true;
        queue.add(new int[]{stx,sty});
        while(!queue.isEmpty()){
            int xy[]=queue.poll();
            for(int i=0;i<4;i++){
                stx=xy[0]+dx[i];
                sty=xy[1]+dy[i];
                //sty=sty+xy[1];
                if(stx<0 || sty<0 || stx>n || sty >m || visit[stx][sty]==true || miro[stx][sty]==0){
                    continue;
                }
                else{
                    visit[stx][sty]=true;
                    queue.add(new int[]{stx,sty});
                    miro[stx][sty]=miro[xy[0]][xy[1]]+1;
                }
            }
        }


    }
}


/*
public class baekjoon2178 {

    static int[][] map;
    static int n;
    static int m;
    static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            for(int j=0; j<m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m];
        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(map[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});

        while(!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0; i<4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                    continue;
                if (visited[nextX][nextY] || map[nextX][nextY] == 0)
                    continue;

                q.add(new int[] {nextX, nextY});
                map[nextX][nextY] = map[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }
    }
}
*/