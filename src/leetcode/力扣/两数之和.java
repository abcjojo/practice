package leetcode.力扣;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2020-07-02 20:22
 **/
public class 两数之和 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length/2; i++){
            for (int j = nums.length-1; j > i; j--){
                if (nums[j] + nums[i] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}
