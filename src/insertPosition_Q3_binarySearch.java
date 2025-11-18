class Solution3 {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        boolean found = false;
        while(low <= high){
            int middle = (low+high)/2;
            if(nums[middle] == target){
                found = true;
                return middle;
            } else if(nums[middle] < target){
                low = middle + 1;
            } else{
                high = middle  - 1;
            }
//            if(!found && target > nums[middle]){
//                return middle+1;
//            } else if (!found && target < nums[middle]) {
//                return middle ;
//            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(a,target));
    }
}