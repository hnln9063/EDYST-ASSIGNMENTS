/*
 PREORDER TRAVERSAL (A)
 ---------------------

 Given a binary tree, return the pre order traversal of its node's values.

Example:
-------
Input
-----
Given binary tree
 1
  \
   2
  /
 3

 The input is represented as:

 1 -1 2 3 -1 -1 -1 (Here -1 represents null)



 Please note that the above is only a representation of the input. In the answer, please use the head node to traverse through the tree.

OUTPUT:
-------
[1, 2, 3]

*/

//YOUR ANSWER
//-----------
/*
 reference data types :

 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
                val = x;
                left = null;
                right = null;
        }
 }
 */
class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
	    res.add(root.val);
            helper(root.left, res);
            helper(root.right, res);
        }
    }
}
