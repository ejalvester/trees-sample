package treesample;

//This class represents a node in a binary search tree (BST)
public class TreeNode {
 int val;           // value stored in the node
 TreeNode left;     // left child
 TreeNode right;    // right child

 // Constructor to create a node with a value
 public TreeNode(int val) {
     this.val = val;
     this.left = null;
     this.right = null;
 }
}
