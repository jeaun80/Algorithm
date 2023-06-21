import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class gainjangbo {
    public static void main(String[]args){


        String today = "2022.05.19";
        String[] terms = new String[]{"A 6", "B 12", "C 3"};
        String[] privacies = new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        HashMap<String,Integer> set = new HashMap<>();
        SimpleDateFormat sdfYMD = new SimpleDateFormat("yyyy-MM-dd");

        Date todays=null;
        try {
            todays= sdfYMD.parse(today);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        HashMap<Date,String> map = new HashMap<>();
        for(String s : terms){
            String split[]= s.split(" ");
            set.put(split[0],Integer.parseInt(split[1]));
        }
        for(String s : privacies){
            String split[]= s.split(" ");

            String date = split[0].replaceAll(".","-");
            try {
                Date date1 = sdfYMD.parse(date);
                map.put(date1,split[1]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        for(Date date : map.keySet()){
            date.compareTo(todays);

        }

    }
}
