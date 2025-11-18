import java.util.Arrays;
// https://leetcode.com/problems/two-sum/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0,4,3,0};
        System.out.println(arr.length);
        int target = 0;
        s.twoSum(arr,target);
        System.out.println(Arrays.toString(s.twoSum(arr,target)));
    }
}