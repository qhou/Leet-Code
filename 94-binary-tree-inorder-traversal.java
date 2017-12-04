/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 /*** Iteratively */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //using stack to iterate
        //add root to stack, traverse to root.left
        //keep traversing until root.left == null
        //destack node n
        //if n has root.right
        //add to stack
        //if not destack from node
        //do this until root.right == null
        
        List<Integer> inOrder = new LinkedList<Integer>();
        Stack<TreeNode> toVisit = new Stack<>();
        
        TreeNode currNode = root;
        
        while (!toVisit.empty() || currNode != null){
            while(currNode != null){
                toVisit.push(currNode);
                currNode = currNode.left;
            }

            currNode = toVisit.pop();
            inOrder.add(currNode.val);
            currNode = currNode.right;
            
        }
        return inOrder;
    }
}




/*** Recursively */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //inorder: left, root, right
        List<Integer> inOrder = new LinkedList<Integer>();
        if (root != null){
            traversalHelper(root, inOrder);
        }
        return inOrder;
        }
    
    
    public void traversalHelper(TreeNode root, List<Integer> inOrder){
        if (root != null){
            if (root.left != null){ 
                traversalHelper(root.left, inOrder); 
            }
            
            inOrder.add(root.val);
            
            if (root.right != null){
                traversalHelper(root.right, inOrder);
            }
        }
    }
}