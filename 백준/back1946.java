import java.util.Scanner;

public class back1946 {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int count[]=new int[n];
        count[0]=0;
        for(int u=0;u<n;u++) {
            int k = scan.nextInt();
            int num[][] = new int[k][2];
            int j = k;
            count[u]=k;
            for (int i = 0; i < k; i++) {
                num[i][0] = scan.nextInt();
                num[i][1] = scan.nextInt();
            }
            for (int i = 0; i < k; i++) {
                for (int s = 0; s < j; s++) {
                    if (num[i][0] > num[s][0] && num[i][1] > num[s][1]&&i!=s) {
                        count[u]--;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(count[i]);
        }
    }
}
