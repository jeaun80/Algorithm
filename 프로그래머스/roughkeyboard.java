import java.util.HashMap;
import java.util.Map;

public class roughkeyboard {
    public static void main(String[]args){


        String[] keymap = {"BC"};
        String[] targets = {"AC","BC"};


        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i< keymap.length;i++){
            String[]st = keymap[i].split("");

            for(int j=0;j<keymap[0].length();j++){
                int preInt = map.getOrDefault(st[j],50);
                map.put(st[j],Integer.min(j+1,preInt));
            }
        }


        int[] result = new int[targets.length];
        for(int i=0;i< targets.length;i++){
            String[]tar = targets[i].split("");
            int sum = 0;
            boolean flag = true;
            for(int j=0;j<targets[0].length();j++){
                int getJ = map.getOrDefault(tar[j],-1);
                if(getJ== -1){
                    System.out.println("hgid");
                    flag = false;
                    result[i] = -1;
                    break;
                }
                sum += getJ;
            }
            if(flag){
                result[i] = sum;
            }
        }

        System.out.println(result[0]+""+result[1]);
    }
}
