

/**
 * @author shw
 * @createTime 2023年04月13日 19:54:00
 * @description 第1题 两数之和
 * 遍历数组进行求和，与目标结果进行比较。 时间复杂度O(n²)
 */

public class No1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
