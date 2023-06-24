import javax.swing.plaf.synth.SynthUI;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class mineralmining {
    public static void main(String[]args){

        int[] picks ={1, 1, 0};
        String[] minerals = { "iron", "iron", "diamond", "iron", "stone", "diamond", "diamond", "diamond"};


        //첫번째로 곡괭이 갯수*5만큼으로 미네랄 순서 절삭
        int sum =0;
        for(int i: picks){
            sum+=i;
        }
        if(sum*5<minerals.length){
            minerals = Arrays.copyOfRange(minerals,0,sum*5);
        }

        //미네랄을 처음부터 5단위로 끊어서 따로 저장
        //따로 저장할 때 이차원배열을 쓰자
        int len = minerals.length/5+1;
        if(minerals.length%5==0){
            len-=1;
        }
        String [][]minifive = new String[len][5];

        int index = 0;
        int a = 0;
        for(int i=0;i<minerals.length;i++){
//            System.out.println(minerals[i]+" 미네랄"+a+index+"일때");
            minifive[a][index++] = minerals[i];
            if(index ==5 ){
                a++;
                index =0;
            }
        }
        //저장한뒤 각 인덱스마다 구한다 다이아일때 피로도, 철일때 피로도 돌일때 피로도

        //그 후 다이아곡괭이 갯수만큼 다이아 피로도 제일적은거 합산하고 boolean값을 통해서 앞으로 계산할배열에서 제외

        //그 후 철, 돌로 진행
        // 항상 다이아든 철이든 돌이든 모든 광물이 다파졋을경우 즉 모든 배열의 boolean값이 false일 경우 종료

        int diasum[] = new int[minifive.length];
        int ironsum[] = new int[minifive.length];
        int stonesum[] = new int[minifive.length];

        for(int i=0;i<minifive.length;i++){
            for(int j=0;j<minifive[i].length;j++){
                //피로도 계산
                if(minifive[i][j]!=null){
                    diasum[i]+=1;
                    if(minifive[i][j].equals("iron")){
                        ironsum[i]+=1;
                        stonesum[i]+=5;
                    }else if(minifive[i][j].equals("diamond")){
                        ironsum[i]+=5;
                        stonesum[i]+=25;
                    }else if(minifive[i][j].equals("stone")){
                        ironsum[i]+=1;
                        stonesum[i]+=1;
                    }
                }
            }
        }
        ValueIndexPair[] valuePairStone =new ValueIndexPair[stonesum.length];

        for(int i=0;i< stonesum.length;i++){
            valuePairStone[i] = new ValueIndexPair(stonesum[i],i);
        }
        Arrays.sort(valuePairStone,Comparator.comparingInt(ValueIndexPair::getValue).reversed());

        //미네랄순서배열에서 돌로 캤을때 피로도가 가장높은순대로 다이아 - 철 - 돌 곡괭이 순서 배열해서 피로도합산
        for(int i=0;i<valuePairStone.length;i++){
            System.out.println(valuePairStone[i].index);
            System.out.println(valuePairStone[i].value);
        }
        int resultsum =0;
        for(int i=0;i<valuePairStone.length;i++){
                if(picks[0]>0){
                    resultsum+=diasum[valuePairStone[i].index];
                    picks[0]--;
                    System.out.println("다이아 더하기이고 현잴 ㅣ절트 섬은 "+ resultsum);
                }
                else if(picks[1]>0){
                    resultsum+=ironsum[valuePairStone[i].index];
                    picks[1]--;
                    System.out.println("철 더하기이고 현잴 ㅣ절트 섬은 "+ resultsum);

                }
                else if(picks[2]>0){
                    resultsum+=stonesum[valuePairStone[i].index];
                    picks[2]--;
                    System.out.println("돌 더하기이고 현잴 ㅣ절트 섬은 "+ resultsum);

                }
                else if(picks[0]==0 && picks[1]==0 && picks[2]==0){
                    break;
                }
        }
        System.out.println(resultsum);



    }
    static class ValueIndexPair {
        private final int value;
        private final int index;

        public ValueIndexPair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
}