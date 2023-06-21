public class dutchil {
    public static void main(String []args){


        int n=4;
        int m=1;
        int selection[] = new int[]{1,2,3,4};
        int map[] = new int[n];
        int count =0;
        boolean boo = false;
//01234567
        for(int s : selection){
            map[s-1]= 1;
        }
        //1,2,5

        for(int i=0;i<n;i++){
            if(map[i]==1 && i+m<n){
                for(int j=i;j<i+m;j++){
                    map[j]=0;
                }
                count++;
            }
            else if(map[i]==1 && i+m>=n){
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
