import java.util.*;


public class beakjun_2504 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);

        String a= scan.next();

        int res=0;
        int count=1;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<a.length();i++){
            switch(a.charAt(i)){
                case '(':
                    s.push('(');
                    count*=2;
                    break;
                case '[':
                    s.push('[');
                    count*=3;
                    break;
                case')':
                    if(a.isEmpty() || s.peek()!='('){
                        res=0;
                        break;
                    }
                    if(a.charAt(i-1)=='(') res+=count;
                        s.pop();
                        count/=2;
                        break;
                case']':
                    if(a.isEmpty() || s.peek()!='['){
                        res=0;
                        break;
                    }
                    if(a.charAt(i-1)=='[') res+=count;
                        s.pop();
                        count/=3;
                        break;
            }

        }
        if(!s.isEmpty()){
            System.out.print(0);
        }
        else{
            System.out.print(res);
        }


    }
}
