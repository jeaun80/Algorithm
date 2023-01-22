import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2468 {

    static int map[][];
    static boolean watermap[][];
    static boolean visit[][];

    static int answer,size;
    public static void main(String[]args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());
        map= new int[size+1][size+1];
        for(int i=0;i<size;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0;j<size;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int maxanswer =1;

        for(int i=1;i<=100;i++){
            answer=0;
            visit= new boolean[size+1][size+1];
            watermap= new boolean[size+1][size+1];
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    if(i>=map[j][k]){
                        watermap[j][k]=true;
                    }
                }
            }

            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    if(!watermap[j][k] && !visit[j][k]){
                        dfs(j,k);
                        answer++;
                    }
                }
            }
            if(maxanswer<answer){
                maxanswer=answer;
            }
        }
        System.out.println(maxanswer);
    }

    public static void dfs(int startx,int starty){
        if( startx<size && startx>=0 && starty<size && starty>=0){
            if(!watermap[startx][starty] && !visit[startx][starty]){
                visit[startx][starty]= true;
                dfs(startx+1,starty);
                dfs(startx,starty+1);
                dfs(startx,starty-1);
                dfs(startx-1,starty);
            }
        }
    }
}
