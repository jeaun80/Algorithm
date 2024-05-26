import java.util.*;
class Solution {
    
    public int ans(int arr[][],int []wire){
        int min = Math.abs(search(arr,wire,wire[0]) - search(arr,wire,wire[1]));
        return min;
    }
    // 1, [[1, 2], [1, 3], [1, 4]] answer = 2
    public int search(int[][]arr,int wire[],int start){   
        int [][]copyarr = arr;
        copyarr[wire[0]][wire[1]] = 0;
        copyarr[wire[1]][wire[0]] = 0;
        Queue<Integer>que = new LinkedList<>();
        que.add(start);
        for(int i=0;i<copyarr[start].length;i++){
            if(copyarr[start][i]==1){
                que.add(i);
                copyarr[start][i] = 0;
                copyarr[i][start] = 0;
            }
        }
        // System.out.println("que size = "+que.size());
        if(que.size()==1){
            // System.out.println("hi");
            return 1;
        }
        int num = 0;
        while(!que.isEmpty()){
            int p = que.poll();
            num++;
            for(int i=0;i<copyarr[p].length;i++){
                if(i==p){
                    continue;
                }
                if(copyarr[p][i]==1){
                    copyarr[p][i] = 0;
                    copyarr[i][p] = 0;
                    que.add(i);
                }
            }
        }
        // System.out.println(num+" "+ start);
        return num;
    }
    public static int[][] deepCopy(int[][] original) {
        if (original == null) {
            return null;
        }

        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = new int[original[i].length];
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
        return copy;
    }
    public int solution(int n, int[][] wires) {
        int answer = -1;
        int min = Integer.MAX_VALUE;
        int[][]arr = new int[n+1][n+1];
        
        for(int i=0;i<wires.length;i++){
            arr[wires[i][0]][wires[i][1]] =1;
            arr[wires[i][1]][wires[i][0]] =1;
        }
        for(int i=0;i<wires.length;i++){
            
            min = Math.min(min,ans(deepCopy(arr),wires[i]));
            // System.out.println(min);
        }
        
        
        //현재의 이차원배열을 다시 인덱스기준의 이차원배열 트리로 바꾼다
        
        //양방향연결트리로 바꾼다
        
        //
        //모든경우의 수를 다근는다
        //각 양방향연결트리에서 1에서 0으로 바꾼다
        //한 ㅏ끊고 끊은 곳 2군데있으면
        //2군데에서부터 시작해서 모든 트리를 순회한다
        //순회하면서 갯수를 센다
        //갯수가 가장 적을때를 찾는다
        //리턴한다
        //
        //모든과정은 새로운 함수를 작성하여 임시함수 배열로 작동하게한다. 연결을끊고 객수를센뒤 다시 연결을 복구해야하기때문이다
        
        
        return min;
    }
}