public class BuildTree {
    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return construct(preorder, 0, inorder.length - 1);
    }
        private TreeNode construct(int[] preorder, int left, int right) {
            if (left > right)
                return null;
            int value = preorder[preIndex++];
            TreeNode root = new TreeNode(value);
            int mid = map.get(value);
            root.left = construct(preorder,left,mid - 1);
            root.right = construct(preorder,mid + 1,right);
            return root;

        }
    
}
