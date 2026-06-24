public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrderList = new LinkedList<>();
        helper(root,inOrderList);
        boolean isBST = true;
        int prev = inOrderList.get(0);
        for(int i = 1;i < inOrderList.size(); i++) {
            if(inOrderList.get(i) <= prev) {
                isBST = false;
            }
            prev = inOrderList.get(i);
        }
        return isBST;
    }
    void helper(TreeNode treenode,List<Integer> inOrderList) {
        if(treenode == null) {
            return;
        }
        helper(treenode.left,inOrderList);
        inOrderList.add(treenode.val);
        helper(treenode.right,inOrderList);
    }
}
