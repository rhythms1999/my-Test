package Question1;

/*给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。
示例 1：

输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：

输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：

输入：nums = [3,3], target = 6
输出：[0,1]

 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arrknowledge {
    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        System.out.println(Arrays.toString(Solution2.twoSum(nums, target)));
    }
    static class Solution2 {
        public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
            int length = nums.length;
            Map<Integer,Integer> hashMap = new HashMap<>(length-1);
            hashMap.put(nums[0],0);// 第一个元素之前一定没有元素与它对应，直接存进哈希表

            for (int i = 1; i < length ; i++) {
                int another = target-nums[i];
                if (hashMap.containsKey(another)){
                    return new int[]{i,hashMap.get(another)};
                }
                hashMap.put(nums[i],i);
            }
            throw new IllegalAccessException("No two sum solution");
        }
    }
}

