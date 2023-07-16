public class checkyourdistance {


    static int[][] moveA = {{-1,-1},{1,1},{-1,1},{1,-1}};

    static int[][] checkA = {{0,-1},{1,0},{-1,0},{1,0}};
    static int[][] checkA2 = {{-1,0},{0,1},{0,1},{0,-1}};
    static int[][] moveB = {{0,-2},{0,2},{2,0},{-2,0}};
    static int[][] checkB = {{0,-1},{0,1},{1,0},{-1,0}};
    static int[]result;
    public static void main(String[]args){

        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};


        String[][]Map = new String[5][5];
        result= new int[places.length];


        for(int i=0;i< places.length;i++){

            for(int j=0;j<places[i].length;j++){

                String[]MapInput = places[i][j].split("");

                for(int m = 0;m<MapInput.length;m++){
                    Map[j][m] = MapInput[m];
                }
            }

            //map완성

            if(check(Map)){
                result[i] = 1;
            }
        }
        for(int i=0;i< result.length;i++){
            System.out.print("답은 "+result[i]+ " ");
        }

    }
    public static boolean check(String[][]Map){

        for(int j = 0;j< Map.length;j++){
            for(int k = 0;k<Map[j].length;k++){
                if(Map[j][k].equals("P")){
                    for(int a = 0;a<4;a++){

                        int checkAx = j+checkA[a][0];
                        int checkAy = k+checkA[a][1];
                        if(checkAx>=0 && checkAy>=0 && checkAy<5 && checkAx<5){
                            if(Map[checkAx][checkAy].equals("P")){
                                return false;
                            }
                        }
                    }

                    for(int a = 0;a<moveA.length;a++){
                        int moveAx = j+moveA[a][0];
                        int moveAy = k+moveA[a][1];
                        int checkAx = j+checkA[a][0];
                        int checkAy = k+checkA[a][1];

                        int checkA2x = j+checkA2[a][0];
                        int checkA2y = k+checkA2[a][1];
                        if(moveAx>=0 && moveAy>=0 && moveAx<5 && moveAy<5){
                            if(Map[moveAx][moveAy].equals("P")){
                                if(Map[checkAx][checkAy].equals("X") && Map[checkA2x][checkA2y].equals("X")){
                                }
                                else{
                                    return false;
                                }
                            }
                        }

//                        int moveBx = j+moveB[a][0];
//                        int moveBy = k+moveB[a][1];
//
//                        int checkBx = j+checkB[a][0];
//                        int checkBy = k+checkB[a][1];
//
//                        if(moveBx>=0 && moveBy>=0 && moveBx<5 && moveBy<5){
//                            if(Map[moveBx][moveBy].equals("P")){
//                                if(Map[checkBx][checkBy].equals("X")){
//                                }
//                                else{
//                                    return false;
//                                }
//                            }
//                        }
                    }


                }
            }
        }
        return true;
    }
}
