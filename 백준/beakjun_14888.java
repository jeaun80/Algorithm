import java.util.*;

public class beakjun_14888 {

    static int a;
    static int n[];
    static int gan[];
    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;

    public static void dfs(int s,int index){
        if(index==a){
            max=Math.max(max,s);
            min= Math.min(min,s);
            return;
        }
        for(int i=0;i<4;i++){
            if(gan[i]>0){
                gan[i]--;
                if(i==0){
                    dfs(s+n[index],index+1);
                }
                else if(i==1){
                    dfs(s-n[index],index+1);
                }
                else if(i==2){
                    dfs(s*n[index],index+1);
                }
                else if(i==3){
                    dfs(s/n[index],index+1);
                }
                gan[i]++;

            }
        }

    }
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();

        n=new int[a];
        gan=new int[4];
        for(int i=0;i<a;i++){
            n[i]=scan.nextInt();
        }
        for(int i=0;i<4;i++){
            gan[i]=scan.nextInt();
        }
        dfs(n[0],1);

        System.out.println(max);
        System.out.println(min);



    }
}
