import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class baekjoon1157 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<word.length();i++){
            String index = String.valueOf(word.charAt(i)).toUpperCase(Locale.ROOT);

            if(map.containsKey(index)){
                map.put(index,map.get(index)+1);
            }
            else{
                map.put(index,1);
            }
        }
        int min = 0;
        String answer= "";
        for(String i : map.keySet()){
            if(min<map.get(i)){
                min = map.get(i);
                answer =i;
            }
        }
        int count =0;
        for(int i : map.values()){
            if(i==min){
                if(count==1){
                    System.out.println("?");
                    return;
                }
                count++;
            }
        }
        System.out.println(answer);
    }
}
