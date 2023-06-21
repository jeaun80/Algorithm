import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class recordofmemories {
    public static void main(String[]args){
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int result[] = new int[photo.length];


        Map<String,Integer> map = new ConcurrentHashMap<>();
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }

        for(int i=0;i<photo.length;i++){
            int score = 0;
            for(int j=0;j<photo[i].length;j++){
                score += map.getOrDefault(photo[i][j],0);
            }
            result[i]= score;
        }
        for (int i=0;i< result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
