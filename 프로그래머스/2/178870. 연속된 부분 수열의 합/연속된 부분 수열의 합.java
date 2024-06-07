class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        //투포인터 사용해야된다 앞인덱스와 뒤인덱스를 
        //앞인덱스가 빠른게 먼저기때문에 뒤인덱스 먼저늘리면서 앞인덱스가 되면 그걸로 이동
        //롱롱람쥐
        int N = sequence.length;
        int right = sequence.length;
        int left = 0;
        int sum =0;
        int r = 0;
        for(int i=0;i<sequence.length;i++){
            while(sum<k && r<N){
                sum+=sequence[r++];
            }
            if(sum==k){
                
                if(right-left>r-1-i){
                    
                    left = i;
                    right = r-1;
                }
            }
            sum-=sequence[i];
            
        }
        answer[0] = left;
        answer[1] = right;
        return answer;
    }
}