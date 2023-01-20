import java.util.Scanner;

public class baekjoon1032 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String compare ="";
        for(int i=0;i<n;i++){
            String word = scan.nextLine();
            if(i==0){
                compare = word;
                continue;
            }
            StringBuilder st = new StringBuilder();

            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==compare.charAt(j)){
                    st.append(word.charAt(j));
                }
                else{
                    st.append("?");
                }
            }
            compare= st.toString();
        }
        System.out.println(compare);
    }
}
