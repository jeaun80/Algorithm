public class spinArray {
    public static void main(String[]args){


        int rows =6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};

        int Map[][] = new int[rows][columns];
        int index=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Map[i][j]=index++;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Map[i][j]);
            }
            System.out.println();
        }
        int[] result =new int[queries.length];

        for(int i=0;i< queries.length;i++){

            int min = Integer.MAX_VALUE;
            int startx = queries[i][0]-1;
            int starty = queries[i][1]-1;
            int endx = queries[i][2]-1;
            int endy = queries[i][3]-1;

            int movex = startx;
            int movey = starty;
            int moveendx =  endx;
            int moveendy =  endy;

            int a1=0;
            int a2=0;
            int a3=0;
            int a4=0;
            while(movey!=endy){
                min = Math.min(min,Map[movex][movey]);
                int nexty=movey+1;
                System.out.println(nexty+" "+ endy);
                a1 = Map[movex][nexty];
//                Map[movex][nexty] = Map;
                movey++;
            }
            while(movex!=endx){
                min = Math.min(min,Map[movex][movey]);
                int nextx=movex+1;
                Map[nextx][movey] = Map[movex][movey];
                movex++;

            }
            while (movey!=starty){
                min = Math.min(min,Map[movex][movey]);
                int nexty=movey-1;
                Map[movex][nexty] = Map[movex][movey];
                movey--;
            }
            while (movex!=startx){
                min = Math.min(min,Map[movex][movey]);
                int nextx=movex-1;
                Map[nextx][movey] = Map[movex][movey];
                movex--;

            }

            result[i]= min;
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Map[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
