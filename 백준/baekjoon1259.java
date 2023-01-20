import java.util.Scanner;

public class baekjoon1259 {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        while(true){
            String word = scan.nextLine();

            if(word.equals("0")){
                return;
            }
            int len = word.length();
            int n =0;
            if(len%2!=0){
                n = (len-1)/2;
            }
            else{
                n= len/2;
            }
            len -=1;
            Boolean flag = true;
            for(int i=0;i<n;i++){

                if(word.charAt(i)!=word.charAt(len--)){
                    System.out.println("no");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("yes");
            }
        }
    }
}
