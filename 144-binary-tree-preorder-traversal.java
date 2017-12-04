/*
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
*/
/*** Iteratively */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //preorder: root, left, right
        //push node.right onto stack
        //traverse through node.left, 
        //when node.left is null, pop from stack
        List<Integer> preList = new LinkedList<Integer>();
        Stack<TreeNode> toVisit = new Stack<TreeNode>();
        TreeNode currNode = root; 
        
            while (currNode != null){
                preList.add(currNode.val);
                if (currNode.right != null){
                     toVisit.push(currNode.right);
                }
                currNode = currNode.left;
                
                if (currNode == null && !toVisit.isEmpty()){
                    currNode = toVisit.pop();
                }
            }
        return preList;
    }
}






/*** Recursively */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        //preorder: root, left, right
        List<Integer> preList = new LinkedList<Integer>();
        
        if (root == null)
            return preList;
        
        preList = traverse(root, preList);
        
        return preList;
    }
    
    public List<Integer> traverse(TreeNode root, List<Integer> preList){
        if (root == null){
            return preList;
        } 
        preList.add(root.val);
        
        traverse(root.left, preList);
        traverse(root.right, preList);
        
        return preList;
    }
}