import java.util.LinkedList;
import java.util.List;

public class islandtravel {
    public static int sum;
    public static int[][]map;
    public static boolean[][]visit;

    public static int [][]move  = {{0,1},{0,-1},{-1,0},{1,0}};
    public static void main(String[]args){

        String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};



        map = new int[maps.length][maps[0].length()];
        visit = new boolean[maps.length][maps[0].length()];

        boolean igonore = false;
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[i].length();j++){
                if(maps[i].charAt(j)== 'X'){
                    map[i][j] = 0;
                }
                else{
                    igonore= true;
                    map[i][j] = Integer.parseInt(String.valueOf(maps[i].charAt(j)));
                }
            }
        }
        if(!igonore){
           int[] result = new int[]{-1};
        }

        sum = 0;
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                if(map[i][j]>0 && !visit[i][j]){
                    dfs(i,j);
                    list.add(sum);
                    sum = 0;
                }
                else{
                    sum = 0;
                }
            }
        }
        int[]result = list.stream().sorted().mapToInt(Integer::intValue).toArray();

        for(int i=0;i<list.size();i++){
            ;
            System.out.print(result[i]+" ");
        }


    }
    public static void dfs(int i,int j){
        sum+=map[i][j];
        visit[i][j] =true;
        for(int m=0;m<4;m++){
            int nextI = i+move[m][0];
            int nextJ = j+move[m][1];

            if(nextI>=0 && nextJ>=0 && nextJ<map[0].length && nextI<map.length){

                if(map[nextI][nextJ]>0 && !visit[nextI][nextJ]){
                    dfs(nextI,nextJ);
                }
                else{
                    continue;
                }
            }
        }
    }
}
