public class MaxPathSum {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        gain(root);
        return maxSum;
    }
    private int gain(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(gain(root.left),0);
        int right = Math.max(gain(root.right),0);
        int path = root.val + left + right;
        maxSum = Math.max(maxSum,path);
        return root.val + Math.max(left, right);
    }
}