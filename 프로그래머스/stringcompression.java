import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class stringcompression {

    public static void main(String[]args){


        //문자열이 주어지면 반복되는 몇자리까지 짤라서 압축하는방식

        // 그러면 관건은 압축을 할때 몇자리까지 잘라서 압축을 해야할것인가

        // 이거는 일부만보고 자릿수를 정하면 안된다.

        // 즉 전체를 봐야됨 -> 하지만 전체를 볼수 없다?

        // 그러면  그냥 반복 계산때려서 몇자리당 최소값을 찾아야된다.

        // 근데 s의 길이는 1000
        // 그러면 최대 몇자리 까지 압축이되냐 500자리까지도 압축이 된다.
        // 그러면 최대 몇자리까지 반복이냐면 s/2
        // 어떻게 구현하냐

        // que??

        // 관건은 반복 수를줄이는거다
        // 시간초과예상

        //답은 2ababcdcd 이다

        //substring 은 String을 반복해서 만듬으로 시간이 오래걸림
        //흠

        //흠


        //큐는 실패
        //그냥 자르면되는데 왜 큐넣어서 시간늘림

        //반례가 뭐지

        //5번틀림

        //음


//        String s = "ababcdcdababcdcd";
        String s = "a";

        int minlen = Integer.MAX_VALUE;
        for(int i=1;i<=(s.length()/2);i++){
            String first = s.substring(0,i);

            //흠
            StringBuffer sb = new StringBuffer("");
            int count = 1;

            //어케하노
            for(int j=i;j<=s.length();j+=i){

                int minindex = Math.min(j+i,s.length());
                String compar = s.substring(j,minindex);

                if(first.length()==8){
//                    System.out.println("뉸= == "+sb);
                }
                if(compar.equals(first)){
                    count++;
                }
                else{
//                    System.out.println(count);
                    if(count>1){
                        sb.append(count);
                        count =1;
                    }
                    sb.append(first);
                    first = compar;
                }

                //답이 9인데 왜 7나옴

                //이러면
                //이러면 만약에

                // i 가 2일때 0~1까지 잘랐고
                // 그게 first
                // j = 2부터 4까지 짜르ㅕㄴ 2,3
                //그러면 둘이비교
                // 아니면 sb에다가 더학
                //같으면 카운트 올리고 다음꺼 더하기
                //하다가 다른거 나오면 카운트+ 더하기
                //하고 다른거를 first로 오키

            }
            sb.append(first);

            System.out.println(sb.length());
            minlen = Math.min(sb.length(),minlen);

        }

        if(minlen==Integer.MAX_VALUE){
            minlen = 1;
        }
        System.out.println(minlen);

    }
}
