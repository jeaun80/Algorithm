import java.util.*;

public class tuple {
    public static void main(String[]args){


        String s = "{{20,111},{111}}";

        s= s.substring(1,s.length()-1);
//        System.out.print(s);

        String a[]  = s.split("},");
        for(int i=0;i<a.length;i++){
            a[i]=a[i].replace("{","");
            a[i]=a[i].replace("}","");
        }
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        List<String> list = List.of(a);

        HashSet<Integer> set = new HashSet<>();


        int min =0;
        String maxString = "";
        for(String rid : list){
            System.out.println(rid);

            if(rid.contains(",")){
                System.out.println("af");
                String[] as = maxString.split(",");
                for(String t : as){
                    System.out.println("af");
                    System.out.println(t);
//                int in = Integer.parseInt(t);
//                if(set.contains(in)){
//                    continue;
//                }
//                else{
//                    set.add(in);
//                    break;
//                }
                }
            }
//            else{
//                String as[]= new String[1];
//                as[0] = maxString;
//                for(String t : as){
//                    System.out.println(t);
//                int in = Integer.parseInt(t);
//                if(set.contains(in)){
//                    continue;
//                }
//                else{
//                    set.add(in);
//                    break;
//                }
//                }
//            }
        }


        Object[] result =set.toArray();
        for(Object i : result){
            System.out.print(i+" ");
        }

    }
}
