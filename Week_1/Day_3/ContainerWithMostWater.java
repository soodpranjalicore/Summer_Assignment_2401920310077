public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            int k = Math.min(height[left],height[right]);
            int area = width * k;
            maxArea = Math.max(area,maxArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            } 
        }
        return maxArea;
    }
}
