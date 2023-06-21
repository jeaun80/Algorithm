import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class runningrace {

    public static void main(String[]args){

        String []players = {"mumu", "soe", "poe", "kai", "mine"};
        String []callings = {"kai", "kai", "mine", "mine"};

        HashMap<String,Integer> playerMap = new LinkedHashMap<>();
        for(int i=0;i<players.length;i++){
            playerMap.put(players[i],i);
        }

        for(int i =0;i<callings.length;i++){
            String s = callings[i];
            int playerSIndex = playerMap.get(s);//map에 등록된 kai의 순위
            players[playerSIndex] = players[playerSIndex-1];
            players[playerSIndex-1]= s;
            playerMap.put(players[playerSIndex-1],playerMap.get(players[playerSIndex-1]));//역전당한놈
            playerMap.put(s,playerMap.get(s)-1);//역전한놈
//
//            for(int a=0;a<players.length;a++){
//                System.out.print(players[a]+" ");
//            }
//            System.out.println();
////            System.out.print(playerMap.keySet());

        }
    }
}
