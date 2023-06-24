public class Findthebignumber {
    public static void main(String[]args){



        int[] numbers ={10, 1, 10, 2, 10, 3, 10, 10, 10, 11, 11, 11, 12};

        int[] result = new int[numbers.length];

        result[result.length-1]= -1;
        for(int i=numbers.length-1;i>0;i--){
            int compareNum = numbers[i];
            int curNum = numbers[i-1];
            if(compareNum > curNum){
                result[i-1] = compareNum;
            }
            else if(compareNum==curNum && result[i]!= -1){
                result[i-1] = result[i];
            }
            else if(compareNum<=curNum && result[i]== -1){
                result[i-1] = -1;
            }
            else if(compareNum<curNum && result[i]!= -1){
                for(int j = i;j<numbers.length;j++){
                    if(curNum<result[j]){
                        result[i-1] = result[j];
                        break;
                    }
                    if(j==numbers.length-1){
                        result[i-1] = -1;
                    }
                }
            }
        }
    }
}
