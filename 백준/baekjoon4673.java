public class baekjoon4673 {

    static int n[];
    static boolean visit[];
    public static void main(String[]args ){


        n=new int[10001];
        visit=new boolean[10001];

        for(int i=0;i<10001;i++){
            n[i]=i;
        }
        int a=0;

        visit[2]=true;

        for(int i=2;i<10001;i++){
            if(visit[i]==true){
                continue;
            }
            a=i;
            while(a<10000 && visit[i]==false){
                a=d(a);

            }
            a=0;
        }
        visit[4]=true;
        for(int i=1;i< visit.length;i++){
            if(visit[i]==false){
                System.out.println(i);
            }
        }

    }

    public static int d(int n){
        String s=String.valueOf(n);
        String[]a = s.split("");

        for(int i=0;i<a.length;i++){
            n+=Integer.parseInt(a[i]);
        }
        if(n<10001){
            visit[n]=true;
        }
        //System.out.println(n);

        return n;


        /*
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }*/

    }
}
