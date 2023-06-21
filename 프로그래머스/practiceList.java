import java.util.*;
import java.util.stream.Collectors;

public class practiceList {
    public static void main(String[]args){


        // list<Integer> -> array
        List<Integer> list  = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //반복문을 사용한 방법
        int [] arrays = new int[list.size()];
        for(int i=0;i< list.size();i++){
            arrays[i]=list.get(i);
        }
        for(int i : arrays){
//            System.out.print(i+" ");
        }

        //stream을 사용한 방법

        int [] arr = list.stream()
                .mapToInt(i -> i)
                .toArray();
        int [] arry = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println();

        for(int i: arry){
//            System.out.print(i+" ");
        }


        //array to list


        //for문을 사용한 방법
        int array[] = new int[]{1,2,3};
        for(int i : array){
            list.add(i);
        }

//        int array[] = new int[]{1,2,3};

        List list1 = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

//        List<String> stList = new ArrayList<>();
//        stList.add("test");

//         = Arrays.stream(st).toList();

//        String[] st = stList.toArray(new String[stList.size()]);
        String[] st = new String[]{"test"};
        List<String> stList = new ArrayList<>();
        for(String s : st){
            stList.add(s);
        }


        stList = new ArrayList<>();
        stList.add("test");
//        String st[] = new String[stList.size()];

        for(int i=0; i<stList.size();i++){
            st[i] = stList.get(i);
        }


        Set<String> set = new HashSet<>();
        set.add("test");
        List<String> stList1 = set.stream().toList();

        for(String s : stList1){
            System.out.println(s);
        }

        HashMap<String,String> map = new HashMap<>();
        List<String> mapValueList = map.values().stream().toList();
        List<String> mapKeyList = map.keySet().stream().toList();
        String[] mapValueArray = map.values().toArray(new String[map.size()]);
        String[] mapKeyArray = map.keySet().toArray(new String[map.size()]);



        HashSet<Integer> intSet = new HashSet<>();

        intSet.add(1);

        List<Integer> intSetList = intSet.stream().toList();
        int[] intSetArray = intSet.stream().mapToInt(i -> i).toArray();
        intSetArray =intSet.stream().mapToInt(Integer::intValue).toArray();

        HashMap<Integer,Integer> IntMap = new HashMap<>();

        int[] intMapValuesArray = IntMap.values().stream().mapToInt(i -> i).toArray();
        int[] intMapKeyArray = IntMap.keySet().stream().mapToInt(i -> i).toArray();

        List<Integer> intMapValuesList = IntMap.values().stream().toList();
        List<Integer> intMapKeyList = IntMap.keySet().stream().toList();


        //list to map

//        IntMap = intMapValuesList.stream().map((i) -> i);

        intMapValuesList = IntMap.values().stream().toList();




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
//        List<String> list = List.of(a);
//
//        HashSet<Integer> set = new HashSet<>();


        int min =0;
        String maxString = "";
//        for(String rid : list){
//            System.out.println(rid);
//
//            if(rid.contains(",")){
//                System.out.println("af");
//                String[] as = maxString.split(",");
//                for(String t : as){
//                    System.out.println("af");
//                    System.out.println(t);
//                }
//            }
//        }


        Object[] result =set.toArray();
        for(Object i : result){
            System.out.print(i+" ");
        }

    }
}
