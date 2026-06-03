public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i = 0; i < nums.length ;i++){
            nums[i] = nums[i]*nums[i];
        }
        for(int k = nums.length-1; k>=0; k--){
            if(nums[left]>nums[right]){
                result[k] = nums[left];
                left++;
            }else{
                result[k] = nums[right];
                right--;
            }
        }
        return result;
    }
}