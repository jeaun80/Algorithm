import java.util.HashMap;

public class halinhangsa {
    public static void main(String[]args){
        
        String[] want = new String[]{"banana","apple","rice","pork","pot"};
        int[] number = new int[]{3,2,2,2,1};
        String[] discount = new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        
        int answer =0;


        HashMap<String,Integer> map = new HashMap<>();
        int index =0;
        for(String s : want){
            map.put(s,number[index++]);
        }
        for(int i=0;i< discount.length-10;i++){


            for(int j = 0;j<10;j++){

//                if(discount[j])

            }

        }
        
        
        
        
    }
}
