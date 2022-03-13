package assignment;

import java.util.HashMap;
import java.util.Map;

public class GreatestKeyAndLeastKey {
    public static void greatest(HashMap<Integer,Integer> map){
    int temp = Integer.MIN_VALUE;
    int temp1 = Integer.MAX_VALUE;
    int maxKey=0;
    int minKey=0;
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue()>temp){
            temp=entry.getValue();
            maxKey= entry.getKey();
        }
        if(entry.getValue()<temp1){
            temp1=entry.getValue();
            minKey=entry.getKey();
        }
    }
        System.out.println("Maximum value key in the map is " +maxKey+",Minimum value key in the map is "+minKey);
}

}
