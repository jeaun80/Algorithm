import java.util.Scanner;

public class baekjoon9093 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for(int i = 0;i<num;i++){

            String word = scan.nextLine();
            String[] inputArray = word.split(" ");
            StringBuilder st = new StringBuilder();
            for(int j=0;j<inputArray.length;j++){
                for(int s=inputArray[j].length()-1;s>=0;s--){
                    st.append(inputArray[j].charAt(s));
                }
                if(j!=inputArray.length-1){
                    st.append(" ");
                }
            }
            System.out.println(st.toString());
        }
    }
}
