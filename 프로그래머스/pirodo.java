public class pirodo {
    private static int[][] dungeons;
    public static boolean[] visit;
    public static int anser;
    public static void main(String []args){


        int k = 80;

        dungeons = new int[3][3];

        dungeons[0][0] = 80;
        dungeons[0][1] = 20;
        dungeons[1][0] = 50;
        dungeons[0][1] = 40;
        dungeons[2][0] = 30;
        dungeons[0][1] = 10;

        visit = new boolean[dungeons.length+1];


        //dfs를 사용해보자
        anser = 0;
        dfs(dungeons,k,0);
        System.out.println(anser);
    }

    public static void dfs(int[][] dungeons,int k,int deep){

        for( int i=0;i<dungeons.length;i++){
            if(!visit[i] && dungeons[i][0]<=k){
                visit[i] = true;
                dfs(dungeons,k+dungeons[i][1],deep+1);
                visit[i]=false;
            }
        }
        anser = Math.max(anser, deep);

    }
}
