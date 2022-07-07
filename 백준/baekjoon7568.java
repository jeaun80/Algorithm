import java.util.Scanner;

public class baekjoon7568 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);


        int N=scan.nextInt();

        point[] a=new point[N+1];
        for(int i=0;i<N;i++){
            int q=scan.nextInt();
            int p=scan.nextInt();

            a[i]=new point(q,p);
        }

        for(int i=0;i<N;i++){
            int s1=a[i].x;
            int s2=a[i].y;
            int count=1;
            for(int j=0;j<N;j++){
                if(a[j].x>s1 && a[j].y>s2){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
    static class point{
        public int x;
        public int y;
        public point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
