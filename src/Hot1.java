import java.util.HashMap;
import java.util.Map;

/**
 * @author shw
 * @date 2023/11/24 20:34
 * @description 两数之和
 */
public class Hot1 {
    /***
     * @author shw
     * @date 2023/11/24 20:35
     * @return int[]
     * 使用Map集合进行求解
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashtable = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }else{
                hashtable.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
