import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon1966 {

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int what=scan.nextInt();

        for(int s=0;s<what;s++){
            int importance[]=new int[10];
            int document=scan.nextInt();
            int index=scan.nextInt();
            Queue<int[]> que =new LinkedList<>();

            for(int i=0;i<document;i++){
                int a=scan.nextInt();

                importance[a]++;

                que.add(new int[]{i,a});


            }

            int count=0;
            while(!que.isEmpty()){
                int a[]= que.poll();
                //a[0]=위치
                //ㅁ[1]=중요도
                int find=a[1]+1;
                if(find!=10){
                    for(;find<10;find++){
                        //a는 현재 가장앞에잇는문서의 중요도인데
                        //현재 총 문서에서 a보다중요도가 높은게 있는지 체크
                        if(importance[find]>0){
                            //중요도가 더큰게 있을경우
                            que.add(a);
                            if(find==9){
                                count++;
                            }
                            break;
                        }
                        else if(find==9){
                            //중요도가 제일 큰 문서일 경우
                            importance[a[1]]--;
                            count++;
                            if(a[0]==index){
                                System.out.println(count);
                                break;
                            }
                        }
                    }
                }
                else{
                    importance[a[1]]--;
                }

            }

            for(int i=1;i<importance.length;i++){
                System.out.print(importance[i]+ " ");
            }
            System.out.println("Rmx");



        }
    }
}

