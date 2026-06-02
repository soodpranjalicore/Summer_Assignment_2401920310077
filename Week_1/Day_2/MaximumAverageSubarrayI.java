public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0;i < k;i++){
            sum += nums[i];
        }
        int max = sum;
        int left = 0;
        int right = k;
        while(right < nums.length){
            sum = sum - nums[left];
            left++;
            sum = sum + nums[right];
            right++;
            if(sum > max){
                max = sum;
            }

        }
        return (double)max/k; 
    }
}