
import java.util.*;

public class beakjun_1062 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        int n= scan.nextInt();
        int k=scan.nextInt();
        String word[]=new String[n];

        for(int i=0;i<n;i++){
            word[i]=scan.next();
            char a[]=new char[word[i].length()];
            word[i]=word[i].substring(4, word[i].length()-4);
        }

        for(int i=0;i<word[i].length();i++){
            for(int j=0;j<n;j++){
                switch(word[0].charAt(i)){
                    case 'a':
                }
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(word[i]);
        }

    }
}
