/**
 * @author shw
 * @date 2023/11/24 20:36
 * @description
 */
// TODO 优化
public class Hot283 {
    /***
     * @author shw
     * @date 2023/11/24 20:40
     * @return void
     * 循环暴力求解
     */
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        int t=nums[j];
                        nums[j]=nums[i];
                        nums[i]=t;
                        break;
                    }
                }
            }
        }
        System.out.print("[");
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]);
            if(k!=nums.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
