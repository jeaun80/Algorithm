public class ricohcardrobot {

    public static int[] movex = {-1,1,0,0};
    public static int[] movey = {0,0,-1,1};
    public static String[][]map;
    public static int[][]score;
    public static int[][]visit;

    public static void main(String[]args){

        String[] boards = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};


        map = new String[boards.length+1][boards[0].length()+1];
        score = new int[boards.length+1][boards[0].length()+1];
        visit = new int[boards.length+1][boards[0].length()+1];

        int startx = 0;
        int starty = 0;
        int goalx = 0;
        int goaly = 0;
        //맵만들기, 도착지점이랑 시작지점 인덱스 찾기
        for(int i=0;i<boards.length;i++) {
            for (int j = 0; j < boards[i].length(); j++) {
                map[i][j] = String.valueOf(boards[i].charAt(j));
                score[i][j] =9;
                if (map[i][j].equals("R")) {
                    startx = i;
                    starty = j;
                }
                if (map[i][j].equals("G")) {
                    goalx = i;
                    goaly = j;
                }
            }
        }
        for(int i=0;i<boards.length;i++){
            for(int j=0;j<boards[i].length();j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        System.out.println(" "+startx+starty+goalx+goaly+"");


        dfs(startx,starty,0);

        for(int i=0;i<boards.length;i++){
            for(int j=0;j<boards[i].length();j++){
                System.out.print(score[i][j]);
            }
            System.out.println();
        }
        System.out.println("정답은 "+score[goalx][goaly]);
    }
    public static void dfs(int startx, int starty, int distence){

        for(int i=0;i<score.length;i++){
            for(int j=0;j<score[i].length;j++){
                System.out.print(score[i][j]);
            }
            System.out.println();
        }
        visit[startx][starty] = 1;
        score[startx][starty] = Math.min(score[startx][starty],distence);
        distence+=1;
        int nextX;
        int nextY;
        for(int i=0;i<4;i++){
            nextX = startx+movex[i];
            nextY = starty+movey[i];
            if(nextX>=0 && nextY>=0 && nextX<map.length && nextY < map.length && visit[nextX][nextY]!=1){
                if(map[nextX][nextY].equals("D")){
                    //넘어가는거
                    continue;
                }
                else if(map[nextX][nextY].equals("R")){
                    score[nextX][nextY] = Math.min(score[nextX][nextY], distence);
                    break;
                }
                else if(map[nextX][nextY].equals(".")){
                    dfs(nextX,nextY,distence);
                }

            }
        }

    }
}
