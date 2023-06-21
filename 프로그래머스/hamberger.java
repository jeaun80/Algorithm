import java.util.*;

public class hamberger {
    public static void main(String[]args){

        int k = 2;
        int[] tangerine  = new int[]{1, 1, 1, 1, 2, 2, 2, 3};

        int result = 0;
        int count[]= new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int s : tangerine){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Integer> key = new ArrayList<>(map.keySet());
//        Collections.sort(key, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int a1=map.get(o1);
//                int b1=map.get(o2);
//
//                if(a1==b1) return 0;
//                else if(a1<b1) return 1;
//                else return -1;
//            }
//        });
        key.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        int index=0;
        while(k>0){
            k-=map.get(key.get(index));
            result++;
            index++;
        }
        System.out.print(result);
    }
}
