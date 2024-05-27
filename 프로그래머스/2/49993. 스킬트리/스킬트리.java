class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int possilbeArr[] = new int[skill_trees.length];
        String skillArr[] = skill.split("");
        String strArr[] = new String[skill_trees.length];
        for(int i=0;i<skill_trees.length;i++){
            String strA[] = skill_trees[i].split("");
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<strA.length;j++){
                for(int k = 0;k<skillArr.length;k++){
                    if(strA[j].equals(skillArr[k])){
                        sb.append(strA[j]);
                        break;
                    }
                }
            }            
            
            strArr[i] = String.valueOf(sb);   
            // System.out.println(strArr[i]);
        }
        
        for(int i =0;i<skillArr.length;i++){
            for(int j= 0;j<strArr.length;j++){
                if(strArr[j].length()<=i){
                    continue;
                }
                if(possilbeArr[j]==0 && !skillArr[i].equals(String.valueOf(strArr[j].charAt(i)))){
                    possilbeArr[j] = -1;
                }
            }
        }
        for(int i:possilbeArr){
            // System.out.println(i);
            if(i==0){
                answer++;
            }
        }
        // System
        //cbd가 되어있냐 이말이잖수 순서대로 되어있냐 이말이잖수
        
        //cbd빼고는 다빼버리자;
        return answer;
    }
}