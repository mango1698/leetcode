import java.util.HashMap;
import java.util.Map;

/**
 * @author shw
 * @date 2023/11/25 21:25
 * @description 多数元素
 */
public class Hot169 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            Integer t = map.get(num);
            if(t==null){
                map.put(num,1);
            }else{
                map.put(num,t+1);
            }
        }
        int maxNum = 0;
        int maxValue = 0;
        for(int key : map.keySet()) {
            if(map.get(key)>maxNum){
                maxNum = map.get(key);
                maxValue = key;
            }
        }
        return maxValue;
    }
}
