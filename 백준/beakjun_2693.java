

import java.util.Scanner;
import java.util.Arrays;
public class beakjun_2693 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int A[]=new int[10];

            for(int j=0;j<10;j++){
                A[j]=scan.nextInt();
            }
            Arrays.sort(A);
            System.out.println(A[7]);
        }
    }
}
