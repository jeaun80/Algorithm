import java.util.Arrays;
import java.util.Scanner;

public class baekjoon2108 {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);

        int n=scan.nextInt();
        int a[]=new int[n];
        double s1=0;
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            s1+=a[i];
        }
        s1/=n;
        System.out.println(Math.round(s1));
        Arrays.sort(a);
        int s2=a[n/2];
        System.out.println(s2);

        int count = 0;
        int max = -1;
        int mod = a[0];
        boolean check = false;
        for(int i = 0; i < n - 1; i++) {
            if(a[i] == a[i + 1]) {
                count++;
            }else {
                count = 0;
            }

            if(max < count) {
                max = count;
                mod = a[i];
                check = true;
            }else if(max == count && check == true) {
                mod = a[i];
                check = false;
            }
        }


        System.out.println(mod);

        int s4=a[n-1]-a[0];
        System.out.println(s4);
    }
}
