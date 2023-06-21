public class cardmungchi {
    public static void main(String[]args){

        String[] cards1= {"i","water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal ={"i", "want", "to", "drink", "water"};
        int index = 0;

        int oneIndex =0;
        int twoIndex = 0;

        boolean flag = false;
        boolean two = true;
        boolean one = true;
        String result = null;

        for(String s : goal){
            if(s.equals(cards1[oneIndex]) && one){
                oneIndex++;
                if(oneIndex == cards1.length){
                    one= false;
                    oneIndex--;
                }
            }
            else if(s.equals(cards2[twoIndex]) && two){
                twoIndex++;
                if(twoIndex==cards2.length){
                    two=false;
                    twoIndex--;
                }
            }
            else{
                result = "No";
                flag = true;
                break;
            }
        }
        if(!flag){
            result ="Yes";
        }
        System.out.println(result);
    }
}
