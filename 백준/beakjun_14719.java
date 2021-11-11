
import java.util.*;

public class beakjun_14719 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        boolean by=false;
        int count=0;
        int x=scan.nextInt();
        int y=scan.nextInt();
        int blo[][]=new int[x][y];
        int a[]=new int[y];
        for(int i=0;i<y;i++){
            a[i]=scan.nextInt();
        }
        for(int i=x-1;i>=0;i--) {
            for (int j = 0; j < y; j++) {
                if (a[j] > 0) {
                    blo[i][j] = 1;
                    a[j] -= 1;
                }
            }
        }
        for(int i=x-1;i>=0;i--){
            int count1=0;
            for(int j=0;j<y;j++){
                if(blo[i][j]==1 &&by==false){
                    by=true;
                    continue;
                }
                if(blo[i][j]==1&&by==true){
                    count+=count1;
                    count1=0;
                    continue;
                }
                if(blo[i][j]==0 &&by==false){

                    continue;
                }
                if(blo[i][j]==0 &&by==true){
                    count1++;
                    blo[i][j]=2;
                }
            }
            by=false;
        }

        System.out.println(count);

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(blo[i][j]);
            }
            System.out.println();
        }




    }
}
