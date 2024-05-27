class Solution {
    public int[] solution(int n, int s) {
        
        int moc = s/n;
        System.out.println(moc);
        if(n>s){
            int[] answer = {-1};
            return answer;
        }
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = moc;
            s-=moc;
        }
        if(s>0){
            for(int i = arr.length-1;i>=0;i--){
                
                arr[i]++;
                s--;
                if(s==0){
                    break;
                }
                
            }
        }
        return arr;
    }
}