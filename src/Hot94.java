/**
 * @author shw
 * @date 2023/11/26 09:45
 * @description 二叉树中的中序遍历
 */

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
// TODO 待完成
public class Hot94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        List<TreeNode> stack = new ArrayList<>();
        while(root!=null){
            if (root.right!=null){
                stack.add(root);
                root = root.right;
            }
        }

        return result;
    }
}
