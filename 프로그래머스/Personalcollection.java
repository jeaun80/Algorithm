import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Personalcollection {
    public static void main(String[]args){


        String today = "2021.12.08";
        String[] terms = {"A 18"};
        String[] privacies = {"2020.06.08 A"};

        String[]now  = today.split("\\.");
        int year = Integer.parseInt(now[0]);
        int month = Integer.parseInt(now[1]);
        int day = Integer.parseInt(now[2]);

        Map<String,Integer> map = new HashMap<>();
        String[] t;
        for(String s : terms){
            t = s.split(" ");
            map.put(t[0],Integer.parseInt(t[1]));
        }
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<privacies.length;i++){
            String[]index = privacies[i].split(" ");

            String[]nextday = index[0].split("\\.");
            int nextyear = Integer.parseInt(nextday[0]);
            int nextmonth = Integer.parseInt(nextday[1]);
            int nexttoday = Integer.parseInt(nextday[2]);

            int vaildDay = map.get(index[1]);
            nextmonth+=vaildDay;
            if(nextmonth>12){
                nextyear+=(nextmonth/12);
                nextmonth%=12;
                if(nextmonth==0){
                    System.out.println("dkhfa");
                    nextmonth=12;
                    nextyear--;
                }
            }
            System.out.println(nextyear+" "+nextmonth+" "+nexttoday);
            //유효기간의 경우 1~100
//            String today = "2021.12.08";
//            nexttoday = 2022 12 8
            if(year>nextyear){
               answer.add(i+1);
            }
            else if(nextyear==year){
                if(month>nextmonth){
                    answer.add(i+1);
                }
                else if(nextmonth==month){
                    if(day>=nexttoday){
                        answer.add(i+1);
                    }
                }
            }

        }
        answer.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(answer);
    }
}
