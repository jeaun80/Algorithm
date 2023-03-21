public class gisadanwon_wapon {

    public static void main(String[]args){

        int number = 5;
        int limit = 3;
        int power = 2;
        int result=0;

        for(int i=1;i<=number;i++){
            int count = 1;
            for(int j=1;j<=(i/2);j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>limit){
                result+=power;
            }
            else{
                result+=count;
            }
        }
        System.out.println(result);

    }
}
