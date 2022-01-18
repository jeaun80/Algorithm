import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class back10610 {
    public static void main(String []agrs){
        Scanner scan=new Scanner(System.in);

        ArrayList<Integer>list=new ArrayList<>();
        String n=scan.next();
        int total=0;
        for(int i=0;i<n.length();i++){
            total+=n.charAt(i)-'0';
            list.add(n.charAt(i)-'0');
        }
        Collections.sort(list);
        if(total%3==0&&list.get(0)==0){
            for(int i=list.size()-1;i>=0;i--)
            System.out.print(list.get(i));
        }
        else{
            System.out.print(-1);
        }

    }
}
