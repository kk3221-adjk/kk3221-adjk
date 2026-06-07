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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> mp = new HashMap<>();
        Set<Integer> childSet = new HashSet<>();

        for (int[] vec : descriptions) {
            int parent = vec[0];
            int child = vec[1];
            int isLeft = vec[2];

            if (!mp.containsKey(parent)) {
                mp.put(parent, new TreeNode(parent));
            }

            if (!mp.containsKey(child)) {
                mp.put(child, new TreeNode(child));
            }

            if (isLeft == 1) {
                mp.get(parent).left = mp.get(child);
            } else {
                mp.get(parent).right = mp.get(child);
            }

            childSet.add(child);
        }

        for (int[] vec : descriptions) {
            int parent = vec[0];

            if (!childSet.contains(parent)) {
                return mp.get(parent);
            }
        }

        return null;
    }
}