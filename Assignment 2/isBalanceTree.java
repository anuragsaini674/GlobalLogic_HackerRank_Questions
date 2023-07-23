/*Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5

Example 1:

Input:
      1
    /
   2
    \
     3 
Output: 0
Explanation: The max difference in height
of left subtree and right subtree is 2,
which is greater than 1. Hence unbalanced
Example 2:

Input:
       10
     /   \
    20   30 
  /   \
 40   60
Output: 1
Explanation: The max difference in height
of left subtree and right subtree is 1.
Hence balanced.  */

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    public boolean isBalanced(Node root) {
        return checkBalance(root) != -1;
    }

    private int checkBalance(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkBalance(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkBalance(root.right);
        if (rightHeight == -1) {
            return -1; 
        }

        int heightDiff = Math.abs(leftHeight - rightHeight);
        if (heightDiff > 1) {
            return -1; 
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

