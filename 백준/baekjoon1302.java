import java.util.HashMap;
import java.util.Scanner;

public class baekjoon1302 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        HashMap<String,Integer> map = new HashMap<>();
        int num = Integer.parseInt(scan.nextLine());
        for(int i=0;i<num;i++){
            String word = scan.nextLine();
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        int max =0;
        String maxword="";
        for(String s: map.keySet()){
            int snum = map.get(s);
            if(max<snum){
                max = snum;
                maxword=s;
            }
            else if(max==snum){
//                Math.min
//                maxword= Math.min(Character.vamaxword,s);
            }

        }
    }
}
