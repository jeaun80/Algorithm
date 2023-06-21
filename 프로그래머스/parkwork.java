public class parkwork {
    public static void main(String[]args){

        String[] park ={"OSO","OOO","OXO","OOO"};
        String[] routes ={"E 2","S 3","W 1"};

        System.out.println(park.length);
        System.out.println(park[0].length());
        int startY=0;
        int startX=0;
        int xlen = park[0].length();
        int ylen = park.length;
        String[][] map = new String[park.length][park[0].length()];//0~3, 0~2다
        for(int i=0;i< park.length;i++){
            String s = park[i];
            for(int j=0;j<park[i].length();j++){
                map[i][j] = s.substring(j,j+1);
                if(map[i][j].equals("S")){
                    startY=i;
                    startX=j;
                }
                System.out.print(map[i][j]);
            }
            System.out.println();
        }


        //map완성

        // 명령시작

        for(int i=0;i< routes.length;i++){
            String[]t = routes[i].split(" ");

            String move = t[0];
            int distance = Integer.parseInt(t[1]);

            boolean flag = true;

            if(move.equals("E")){
                if(startX+distance>=xlen){
                    System.out.println("E 거리넘어감"+startX+distance);
                    continue;
                }
                for(int j=startX;j<=startX+distance;j++){
                    if(map[startY][j].equals("X")){
                        System.out.println("E방향 X만남");
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    continue;
                }
                startX+=distance;
                System.out.println("현재 내위치"+startY+startX);
            }
            if(move.equals("W")){
                if(startX-distance<0){
                    System.out.println("W 거리넘어감"+startX+distance);
                    continue;
                }
                for(int j=startX;j>=startX-distance;j--){
                    if(map[startY][j].equals("X")){
                        System.out.println("W방향 X만남");
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    continue;
                }
                startX-=distance;
                System.out.println("현재 내위치"+startY+startX);
            }

            if(move.equals("S")){
                if(startY+distance>=ylen){
                    System.out.println("S 거리넘어감"+startY+distance);
                    continue;
                }
                for(int j=startY;j<=startY+distance;j++){
                    if(map[j][startX].equals("X")){
                        System.out.println("S방향 X만남");
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    continue;
                }
                startY+=distance;
                System.out.println("현재 내위치"+startY+startX);
            }

            if(move.equals("N")){
                if(startY-distance<0){
                    System.out.println("N 거리넘어감"+startY+distance);
                    continue;
                }
                for(int j=startY;j>=startY-distance;j--){
                    if(map[j][startX].equals("X")){
                        System.out.println("N방향 X만남");
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    continue;
                }
                startY-=distance;
                System.out.println("현재 내위치"+startY+startX);
            }

        }
        int []result = {startY,startX};
        System.out.println(result[0]+" " +result[1]);
    }
}
