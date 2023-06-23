import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Getreportresult {
    public static void main(String[]args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] gilty_list = id_list;

        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        //최종 결과 -> 신고한 id당 신고처리건수 배열

        //신고횟수 k번 이상일시 해당 신고당한사람을 신고한사람한테 메일 보냄

        //그러면 신고당한사람 : 신고한사람이  1:n으로 구성되야함

        //신고당한사람을 기본키 즉 기준으로 구성

        // 신고당한사람 신고한사람 어트리뷰트 생성

        Map<String, HashSet<String>> map = new HashMap<>();//키 = 신고당한사람 , 밸류 = 신고한사람들이름 set
        Map<String,Integer> mailMap = new HashMap<>(); //키 = 신고한사람 , 밸류 = 처리건수

        //map초기화
        for(int i=0;i<id_list.length;i++){
            HashSet<String> set = new HashSet<>();
            map.put(id_list[i],set);
        }
        for(int i=0;i<id_list.length;i++){
            mailMap.put(id_list[i],0);
        }


        for(int i=0;i<report.length;i++){
            String split[] = report[i].split(" ");
            String singo = split[0];
            String gilty = split[1];

            HashSet<String> set = map.get(gilty);
            set.add(singo);
            map.put(gilty,set);
        }
        for(String s : map.keySet()){
            HashSet<String> set = map.get(s);
            if(set.size()>=k){
                for(String a : set){
                    mailMap.put(a,mailMap.get(a)+1);
                }
            }
        }
        int answer[] = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailMap.get(id_list[i]);
            System.out.println("[STEP 4] answer : " + answer[i]);
        }
    }
}
