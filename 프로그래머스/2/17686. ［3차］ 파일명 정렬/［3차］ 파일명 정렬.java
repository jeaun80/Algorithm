import java.util.*;

class Solution {
    public String[] solution(String[] files) {       
        
        List<file>fList = new LinkedList<>();
        for(int i=0;i<files.length;i++){
        
            String head = files[i].split("[0-9]")[0];
            String number = files[i].substring(head.length());
            fList.add(new file(head,number));
        }
        
        Collections.sort(fList, new Comparator<file>(){
            @Override
            public int compare(file o1,file o2){ 
                int result = o1.head.toLowerCase().compareTo(o2.head.toLowerCase());
                if(result ==0 ){
                    return file.validateNum(o1.number) - file.validateNum(o2.number);
                }
                return result;
            }
        });
        String[]answer = new String[fList.size()];
        for(int i=0;i<fList.size();i++){
            // System.out.println(fList.get(i).head+ " "+ fList.get(i).number);
            answer[i] = fList.get(i).head+ fList.get(i).number;
        }
        return answer;
    }
    
static class file{
    String head;
    String number;
    public file(String head, String number){
        this.head = head;
        this.number = number;
    }
    
    public static int validateNum(String num){
        StringBuilder sb = new StringBuilder();
        
        for(char c : num.toCharArray()){
            
            if(Character.isDigit(c)){
                sb.append(c);
            }
            else{
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
}