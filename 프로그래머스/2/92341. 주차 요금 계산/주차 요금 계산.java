import java.util.*;

class Solution {
    
    public static class Record{
        
        int time;
        int carNum;
        public Record(int time,int carNum ){
            this.time = time;
            this.carNum = carNum;
        }
    }
    public int[] solution(int[] fees, String[] records) {
        
        //fees 전부 빼서 변수화
        //record 빼서 분단위로 변경후 record클래스로 지정해서 set에 넣기
        //set에 이미 존재하면 시간 계산해서 map에 넣기
        List<Integer> set = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> resultMap = new HashMap<>();
        int basicTime = fees[0];
        int basicFee = fees[1];
        int extraTime = fees[2];
        int extraFee = fees[3];
        
        for(int i=0;i<records.length;i++){
            
            String[] record = records[i].split(" ");
            
            String[]time = record[0].split(":");
            int minTime = Integer.parseInt(time[0])*60 +Integer.parseInt(time[1]);
            
            int carNum = Integer.parseInt(record[1]);
            String category = record[2];
            
            if(map.get(carNum)!=null){
                // set.remove(carNum);
                int t = map.get(carNum);
                int resultTime = minTime-t;
                resultMap.put(carNum,resultMap.get(carNum)+resultTime);
                map.remove(carNum);
            }
            else{
                if(resultMap.get(carNum)==null){
                    resultMap.put(carNum,0);
                }
                map.put(carNum,minTime);
                
            }
        }
        List<Integer>carList = new ArrayList<>();
        
        for(int key : map.keySet()){
            int time = map.get(key);
            time = 1439 - time;
            // int fee =basicFee;
            // if(time>basicTime){
            //     time-=basicTime;
            //     fee += (time/extraTime)*extraFee;
            //     if(time%extraTime>0){
            //         fee+=extraFee;
            //     }                
            // }
            // carList.add(key);
            resultMap.put(key,resultMap.get(key)+time);
            // resultMap.put(key,fee);
            
        }
        for(int key:resultMap.keySet()){
            
            int time = resultMap.get(key);
            int fee =basicFee;
            if(time>basicTime){
                time-=basicTime;
                fee += (time/extraTime)*extraFee;
                if(time%extraTime>0){
                    fee+=extraFee;
                }                
            }
            carList.add(key);
            resultMap.put(key,fee);
        }
        
        Collections.sort(carList);
        int []answer = new int[carList.size()];
        for(int i=0;i<carList.size();i++){
            answer[i] = resultMap.get(carList.get(i));
        }
        // int []answer = {};
        return answer;
    }
}