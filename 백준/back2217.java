import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class back2217 {

    public static void main(String []args){
        ArrayList<Integer> lope=new ArrayList();

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        for(int i=0;i<n;i++){
            int a=scan.nextInt();
            lope.add(a);
        }
        sort(lope);
        int we=n;
        int min=0;
        for(int i=0;i<n;i++){
            int a=we*lope.get(i);
            if(a>=min){
                min=a;
            }
            we--;
        }
            System.out.print(min);
    }
}
