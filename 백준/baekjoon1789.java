import java.util.Scanner;

public class baekjoon1789 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Long s= scan.nextLong();
        /*
        double ss= Math.sqrt(s*2);
       // System.out.println(ss);
        if(ss*ss==s) {
            System.out.println((int) Math.round(ss));
        }
            System.out.println((int)Math.round(ss)-1);
*/
        int a=0;
        int i=1;
        int count=0;
        while(s>a){
            a+=i;
            i++;
            count++;
        }
        System.out.println(count-1);

        /*
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        long sum = 0;
        int count = 0;

        for(int i=1; ; i++) {
            if(sum > num)	break;
            sum += i;
            count ++;
        }
        System.out.println(count-1);
        scan.close();*/
        //1,10 55
        //11 20 155
        //20 30 255
        //30 40 355
        //1 100 101 101 101 50
        //1 10 11*5= 55
        //1 20 210 = 21*10
        //1 30 465 = 31 * 15

        // x*(x/2)= 200= 2분의1엑스제곱 400=엑스제곱 400 20-1
    }
}
