/*The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes). 



Example 1:

Input:
       1
     /  \
    2    3
Output: 3
Example 2:

Input:
         10
        /   \
      20    30
    /   \ 
   40   60
Output: 4
Your Task:
You need to complete the function diameter() that takes root as parameter and returns the diameter.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree). */

class Solution {
    // Function to return the diameter of a Binary Tree.
    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        int rootDiameter = leftHeight + rightHeight + 1;

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1+Math.max(height(root.left), height(root.right));
    }
}