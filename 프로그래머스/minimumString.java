public class minimumString {
    public static void main(String[]args){

        String t = "500220839878";
        String p = "7";

        int psize = p.length();

        long intP= Long.parseLong(p);

        int count =0;
        for(int i=0;i<t.length()-psize+1;i++){
            long intT = Long.parseLong(t.substring(i,psize+i));
            if(intT<=intP){
                count++;
            }
        }
        System.out.println(count);
    }
}
