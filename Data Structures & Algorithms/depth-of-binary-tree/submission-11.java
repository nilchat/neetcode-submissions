/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        int depth = 0;

        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode currentNode = pair.getKey();
            int height = pair.getValue();

            if(currentNode != null){
                depth = Math.max(depth, height);
                stack.push(new Pair(currentNode.left, height+1));
                stack.push(new Pair(currentNode.right, height+1));
            }
        }
        return depth;
        
    }
}
