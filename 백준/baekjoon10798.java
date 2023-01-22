import java.util.Scanner;

public class baekjoon10798 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        String [][]wordArray = new String[5][15];

        for( int i =0;i<5;i++){
            String input = scan.nextLine();

            for(int j = 0;j<input.length();j++){
                wordArray[i][j]= String.valueOf(input.charAt(j));
            }
        }
        StringBuilder st = new StringBuilder();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(wordArray[j][i]!=null){
//                    System.out.println(wordArray[j][i]);
                    st.append(wordArray[j][i]);
                }
            }
        }
        System.out.println(st.toString());
    }
}
