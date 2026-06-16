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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        return inOrder(root, result);
    }

    public List<Integer> inOrder(TreeNode root, List<Integer> result){
        if(root == null){
            return result;
        }

        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);

        return result;
    }
}