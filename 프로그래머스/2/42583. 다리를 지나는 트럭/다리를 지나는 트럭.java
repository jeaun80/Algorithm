
import java.util.*;
class Solution {
    
    class Truck{
        int weight;
        int sTime;
        public Truck(int weight,int sTime){
            this.weight = weight;
            this.sTime = sTime;
        }
    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        
        //ㅂ큐생성 건너는 트럭 큐
        //리스트생성 다리지난트럭
        Queue<Truck>que = new LinkedList<>();
        List<Integer>comList = new ArrayList<>();
        int curWeight = 0;
        int curTruck = 0;
        int truckIndex = 0;
        int time= 0;
        while(comList.size() != truck_weights.length){
            
            //현재시간에 끝나는 트럭 있는지 검사후 있으면 빼기
            if(que.size()>=1){
                
                Truck pastT = que.peek();

                if(time - pastT.sTime == bridge_length){
                    Truck rt = que.poll();
                    curWeight -= rt.weight;
                    curTruck--;
                    comList.add(rt.weight);
                }
            }
            // for(Truck t : que){
            //     System.out.print(t.weight+" ");
            // }
            // System.out.println(time);
            int tv = truck_weights[truckIndex];
            
            int nextWeight = curWeight+tv;
            int nextTruck = curTruck+1;
            
            
            if(nextWeight>weight || nextTruck>bridge_length){
                //시간만 넘어가고 그냥 넘어가기
                
            }else{
                curTruck = nextTruck;
                curWeight = nextWeight;
                que.add(new Truck(tv,time));
                if(truckIndex<truck_weights.length-1){
                    truckIndex++;
                }
                //시간도 넘어가고 차량도 도로에 투입하기
            }       
            time++;
        }
        int answer = time;
        // for(int i: comList){
        //     System.out.print(i+" ");
        // }
        return answer;
    }
}