class Solution1 {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high){
            int middle = (low+high)/2;
            if(nums[middle] == target){
                return middle;
            } else if(nums[middle] < target){
                low = middle + 1;
            } else{
                high = middle  - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(search(a,target));
    }
}