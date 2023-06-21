public class deachungMade {
    public static void main(String[]args){

        String[]keymap = new String[]{"ABACD","BCEFD"};

        String[]targets = new String[]{"ABCD","AABB"};



        int[]result = new int[2];
        for(int i = 0;i<targets.length;i++){
            String s = targets[i];
            String[]rid = s.split("");
            int count=0;
            int min=1000;
            boolean flag = false;
            for(int j=0;j< rid.length;j++){
                System.out.println("1");

                for(int k = 0; k<keymap.length;k++){
                    System.out.println("2");

                    String keyS[] = keymap[k].split("");
                    count= count;
                    for(int m = 0;m< keyS.length;m++){
                        System.out.println("3");

                        count++;
                        if(rid[j].equals(keyS[m])){
                            System.out.println("4");

                            flag = true;
                            break;
                        }

                        if(min>count){
                            min=count;
                            System.out.println(count+"!!!!!!!!!!!!!!!!!!!!");
                            count = 0;
                        }
                    }
                }
                result[i]+=min;
            }
            if(!flag){
                int[]reslu = new int[1];
                reslu[0] = -1;

                System.out.println(reslu[0]);
                return ;
            }
//            result[i]=min;
        }
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");

        }
    }
}
