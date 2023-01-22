import java.util.Scanner;

public class baekjoon11655 {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String[] inputArray = word.split(" ");
        StringBuilder st = new StringBuilder();

        for(int i=0;i<inputArray.length;i++){
            for(int j=0;j<inputArray[i].length();j++){
                int num = inputArray[i].charAt(j);
                if(num>=97 && num<=122){
                    num+=13;
                    if(num>122){
                        int cal = num-122;
                        num-=122;
                        num=cal+96;
                    }
                    st.append((char)num);
                }
                else if(num>=65 && num<=90){
                    num+=13;
                    if(num>90){
                        int cal = num-90;
                        num-=90;
                        num=cal+64;
                    }
                    st.append((char)num);
                }
                else{
                    st.append((char)num);
                }
            }
            if(i!=inputArray.length-1){
                st.append(" ");
            }
        }
        System.out.append(st.toString());
    }
}
