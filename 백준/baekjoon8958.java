import java.util.Scanner;

public class baekjoon8958 {
    public static void main(String []args){


        Scanner scan  = new Scanner(System.in);
        int n  = scan.nextInt();
        for(int i=0;i<n;i++){
            int sum = 0;

            String word = scan.next();
//            String word  = "OOXXOXXOOO";
            word = word.replaceAll("[^O]","!");
            String array[]  = word.split("!");
            for(String a : array){
                int count= 1;
                for(int j = 0; j<a.length();j++){
                    sum+=count++;
                }
            }
            System.out.println(sum);
        }
    }
}
