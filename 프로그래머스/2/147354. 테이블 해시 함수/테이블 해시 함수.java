import java.util.*;
class Solution {
    public static int c;
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        //첫번째 컬럼은 기본키
        //col번째 data[][col]번째 오름차순 정렬,/중복인경우 data[][0]으로 내림차순정렬
        //튜플마다 data[i][]의 모든 값을 i로 나눈 나머지의 합을 s_i로 정의
        //begin ~ data[i][] ~ end
        //xor값을 반환
        
        //정렬
        c = col-1;
        Comparator compartor = new Comparator<int[]>(){
            @Override
            public int compare(int o1[],int o2[]){
                if(o1[c]==o2[c]){
                    return o2[0] - o1[0];
                }
                return o1[c]-o2[c];
            }
        };
        if(data.length>1){
            Arrays.sort(data,compartor);
            
        }
        for(int i=row_begin-1;i<row_end;i++){
            int s_i = 0;
            for(int j=0;j<data[i].length;j++){
                s_i += data[i][j] % (i+1);
            }
            answer = answer ^ s_i;
        }
        
        
        
        return answer;
    }
}