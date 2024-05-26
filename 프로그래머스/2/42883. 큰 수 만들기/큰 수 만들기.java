class Solution {
    public String solution(String number, int k) {
        
        StringBuilder sb = new StringBuilder();
        
        
        char[]chNumbers = number.toCharArray();
        int answerLen = chNumbers.length-k;
        String[]answerArr = new String[answerLen];
        int start = 0;
        int jindex= 0;
        
        for(int i=0;i<answerLen;i++){
            char max = '0';
            int lne =k+i;
            
            // System.out.println(start+" "+lne );
            for(int j=start;j<=i+k;j++){
                if(j<chNumbers.length){
                    if(max<chNumbers[j]){
                        max  = chNumbers[j];
                        // jindex = j;
                        start=j+1;

                    }
                }
            }
            sb.append(String.valueOf(max));            
        }
        
        // for(String a: answerArr){
        //     // System.out.println(a);
        // }
        String ans =sb.toString();
        return ans;
        
        
    }
}