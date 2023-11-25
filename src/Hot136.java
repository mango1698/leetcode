import java.util.HashMap;
import java.util.Map;

/**
 * @author shw
 * @date 2023/11/25 21:19
 * @description 只出现一次的数字
 */
// TODO 优化
public class Hot136 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            Integer t = map.get(num);
            if(t==null){
                map.put(num,1);
            }else{
                map.put(num,t+1);
            }
        }
        for(int key : map.keySet()) {
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}
