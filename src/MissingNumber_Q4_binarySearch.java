import java.util.Arrays;

public class MissingNumber_Q4_binarySearch {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {


            if(i == n) {
                return i;
            }else if(i != nums[i] ){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numb = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(numb));
    }
}
