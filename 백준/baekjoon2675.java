import java.util.Scanner;

public class baekjoon2675 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for(int s = 0;s<n;s++){

            String word = scan.nextLine();
            String input[] =word.split(" ");
            int num = Integer.parseInt(input[0]);
            StringBuilder st= new StringBuilder();
            for(int i =0;i<input[1].length();i++){
                for(int j=0;j<num;j++){
                    st.append(input[1].charAt(i));
                }
            }
            System.out.println(st.toString());
        }
    }
}
