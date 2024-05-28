import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        
        Arrays.sort(routes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
            }
        });
        int answer =0;
        int cam = Integer.MIN_VALUE;
        for(int[]route: routes){
            if(cam < route[0]) {
                // 현재 카메라의 위치가 route의 시작 지점보다 작으면
                // 새로운 cam을 route의 종료 지점에 설치한다
                cam = route[1];
                answer++;
            }
        }
        return answer;
    }
}