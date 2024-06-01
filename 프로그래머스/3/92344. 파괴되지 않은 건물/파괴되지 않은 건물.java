import java.util.*;
class Solution {
    static int[][]map;
    public int solution(int[][] board, int[][] skill) {
        
        
        int answer = 0;
        
        //누적합을위한 이차원배열 생성 초기화
        map = new int[board.length+1][board[0].length+1];
        
        //누적합을 위해 skill순회하며 방문
        for(int i=0;i<skill.length;i++){
            int degree = skill[i][5];
            if(skill[i][0]==1){
                degree*=-1;
            }
            map[skill[i][1]][skill[i][2]] +=degree;
            map[skill[i][1]][skill[i][4]+1] -=degree;
            map[skill[i][3]+1][skill[i][2]] -=degree;
            map[skill[i][3]+1][skill[i][4]+1] +=degree;
        }
        //누적합실행
        sum();
        
        //살아있는건물체크
        //baord순회
        for(int i=0;i<board.length;i++){
            for(int j= 0;j<board[i].length;j++){
                if(board[i][j] +map[i][j]> 0){
                    answer++;
                }
                
            }
        }

        return answer;
    }
    public void sum(){
        
        // for (int y = 1; y < N; y++) {
        //     for (int x = 0; x < M; x++) {
        //         sum[y][x] += sum[y - 1][x];
        //     }
        // }
        // // 좌우
        // for (int x = 1; x < M; x++) {
        //     for (int y = 0; y < N; y++) {
        //         sum[y][x] += sum[y][x - 1];
        //     }
        // }
        //좌우
        for(int i=1;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                map[i][j]+=map[i-1][j];
            }
        }
        
        //상하
        for(int i=1;i<map[0].length;i++){
            for(int j=0;j<map.length;j++){
                map[j][i]+=map[j][i-1];
            }
        }
    }
}