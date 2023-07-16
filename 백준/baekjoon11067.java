import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class baekjoon11067 {

    public static void main(String[]args) throws IOException {


        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        //x축에
        //x축이 같고 y축이 항상 가깝고 방문하지않은 곳으로 이동
        //방문할때마다 번호부여
        //부여한 번호가 마지막 번호이면 종료
        //번호를 부여할때도 xy좌표를 같이 저장

        //입력받자

        int T = Integer.parseInt(br.readLine());

        for( int t = 0;t<T;t++){//테스트갯수


            int cafeNum = Integer.parseInt(br.readLine());

            List<index> cafeList = new LinkedList<>();
            int culX = 0;
            int culY = 0;
            for(int i=0;i<cafeNum;i++){

                String[] cafeIndex = br.readLine().split(" ");
                int x = Integer.parseInt(cafeIndex[0]);
                int y = Integer.parseInt(cafeIndex[1]);

                cafeList.add(new index(x,y,false));
            }

            //여기서부터 0,0부터 해서 가장 가까운거찾기

            //최적화 할려면 x축 내림차순 정렬 y축 내림차순 정렬

            cafeList.sort(new Comparator<index>() {
                @Override
                public int compare(index o1, index o2) {

                    return o1.x-o2.x;
                }
            });
            // 현재 자기위치확인


            //같은 x축, 가까운 y축확인
            //그 위치로 현재위치 이동
            //반복
            //더이상 같은x축 없다면 x축 잇을때까지 y축 이동 or 가장 가까운y축을 찾아서 이동
            //함수로 만들자





        }

    }
    public void hi(int culX,int culY,List<index> list){
//        list.get()
    }
    public static class index{
        int x;
        int y;
        boolean visited;
        public index(int x,int y,boolean visit){
            this.x = x;
            this.y = y;
            this.visited = visit;
        }
    }
}
