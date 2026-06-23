public class ZigZagOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
       if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
         while (!queue.isEmpty()) {

            int size = queue.size();         
            LinkedList<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();
                
                if (flag)
                    sublist.addLast(node.val);
                else
                    sublist.addFirst(node.val);


                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }
            result.add(sublist);  
            flag = !flag; 
        }
        return result;
    }
}