/*
 LEAST COMMON ANCESTOR IN A TREE
 --------------------------------

 Find the lowest common ancestor in an unordered binary tree given two values in the tree.

 INPUT:
 ------
 Given binary tree


        ______3_______
       /              \
   ___5___           __7__
  /       \         /     \
 6         2       0       8
          /  \
         7    4

 Node1 = 5
 Node2 = 1

OUTPUT:
-------
  3

 Note:
 -----
 1. You are given 2 values. Find the lowest common ancestor of the two nodes represented by val1 and val2.
 2. No guarantee that val1 and val2 exist in the tree. If one value doesn't exist in the tree then return 1.
 3. There are no duplicate values.
 4. You can use extra memory, helper function and can modify the node struct but, you can't add a parent point.

*/

//SOLUTION
//--------
/*
  Reference code--

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

public class LeastCommonAncestor {

    private ArrayList<Integer> height;

        public int static lca(TreeNode A, int val1, int val2) {
            TreeNode node1, node2;

            node1 = findNode(A, val1);
            node2 = findNode(A, val2);

            if (node1 == null || node2 == null)
                return -1;

            return lca(A, node1, node2);

        }

        public static TreeNode findNode(TreeNode node, int val) {

            if (node == null)
                return null;

            if (node.val == val)
                return node;

            TreeNode left = findNode(node.left, val);
            TreeNode right = findNode(node.right, val);

            if (left == null)
                return right;

            return left;

        }

        public static int lca(TreeNode root, TreeNode node1, TreeNode node2) {
            int height1, height2;

            height1 = findHeight(root, node1, 0);
            height2 = findHeight(root, node2, 0);

            if (height1 < height2) {
                height1 ^= height2;
                height2 ^= height1;
                height1 ^= height2;
                TreeNode temp = node1;
                node1 = node2;
                node2 = temp;
            }

            reverse(root);

            while (height1 != height2) {
                node1 = node1.left;
                height1--;
            }

            while (node1.val != node2.val) {
                node1 = node1.left;
                node2 = node2.left;
            }

            return node1.val;

        }


        public static void reverse(TreeNode root) {
            if (root == null)
                return;
            reverse(root, root.left);
            reverse(root, root.right);
        }

        public static void reverse(TreeNode prev, TreeNode node) {

            if (node == null)
                return;

            reverse(node, node.left);
            reverse(node, node.right);
            node.left = prev;
        }


        public static int findHeight(TreeNode node, TreeNode nodeH, int height) {

            if (node == null)
                return -1;

            if (node.val == nodeH.val) {
                return height;
            }

            int lH = findHeight(node.left, nodeH, height + 1);
            int rH = findHeight(node.right, nodeH, height + 1);

            if (lH == -1)
                return rH;

            return lH;
        }

}
