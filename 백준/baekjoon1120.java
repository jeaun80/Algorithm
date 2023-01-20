import java.util.Scanner;

public class baekjoon1120 {
    public static void main(String[]arsg){
        Scanner scan = new Scanner(System.in);

        String[] word = scan.nextLine().split(" ");
        String A = word[0];
        String B = word[1];

        int min=51;
        for(int j = 0;j<=B.length()-A.length();j++){
            int count=0;
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)!=B.charAt(i+j)){
                    count++;
                }
            }
            if(min>count){
                min=count;
            }
        }
        System.out.println(min);
    }
}
