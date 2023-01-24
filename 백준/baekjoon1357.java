import java.util.Scanner;

public class baekjoon1357 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        String [] word = scan.nextLine().split(" ");

        int x1 = Integer.parseInt(word[0]);
        int x2 =Integer.parseInt(word[1]);
        int answer = rev(rev(x1)+rev(x2));
        System.out.println(answer);

    }
    public static int rev(int x){
        String s = String.valueOf(x);
        StringBuilder st =new StringBuilder(s);
        s = st.reverse().toString();
        return Integer.parseInt(s);
    }
}
