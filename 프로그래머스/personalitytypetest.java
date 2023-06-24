import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class personalitytypetest {
    public static void main(String[]args){

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        String[] personal = {"R","T","C","F","J","M","A","N"};
        Map<String,Integer>map = new HashMap<>();

        //map초기화
        for(int i=0;i<8;i++){
            map.put(personal[i],0);
        }

        ///성경테스트
        for(int i=0;i<survey.length;i++){
            String[]qut = survey[i].split("");
            String start = qut[0];
            String end = qut[1];

            if(choices[i]>4){
                int k = choices[i]-4;
                map.put(end,map.get(end)+k);
            }
            else if(choices[i]==4){
                continue;
            }
            else{
                int k=0;
                if(choices[i]==1){
                    k = 3;
                }else if(choices[i]==2){
                    k = 2;
                }else if(choices[i]==3){
                    k = 1;
                }
                map.put(start,map.get(start)+k);
            }
        }

        //검사결과로 성격결정

        StringBuilder answer = new StringBuilder();
        for(int i =0;i<8;i+=2){
            int a = map.get(personal[i]);
            int b = map.get(personal[i+1]);
            String choice = "";
            if(a==b){
                if(personal[i].compareTo(personal[i+1])>0){
                    choice = personal[i+1];
                }else{
                    choice = personal[i];
                }
            }
            else if(a>b){
                choice = personal[i];
            }
            else if(a<b){
                choice = personal[i+1];
            }
            answer.append(choice);
        }
        System.out.println(answer.toString());

        String a = "a";
        System.out.println(a.compareTo("c"));
    }
}
