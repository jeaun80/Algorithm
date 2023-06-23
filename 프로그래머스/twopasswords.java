import java.util.HashSet;
import java.util.StringTokenizer;

public class twopasswords {
    public static void main(String[]args){

        String s ="aukks";
        String skip ="wbqd";
        int index = 5;

//       기댓값 opqrstuvwxyzklmn
        String[] sSplit = s.split("");

        String[] skipSplit = skip.split("");

        char z = 'a';
        System.out.println(z+0);
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i< skipSplit.length;i++){
            set.add(skipSplit[i].charAt(0));
        }

        StringBuilder answer = new StringBuilder();
        for(int i=0;i<sSplit.length;i++){
            char A = sSplit[i].charAt(0);
            for(int j = 1;j<=index;j++){
                if(A=='z'){
                    A= 'a';
                }
                else {
                    A+=1;
                }
                while(set.contains(A)){
                    System.out.print("hi");
//                    j--;
                    if(A=='z'){
                        A='a';
                    }
                    else{
                        A++;
                    }
                }

            }
            char result = (char)A;
            answer.append(result);
        }
        System.out.println(answer.toString());
    }
}
