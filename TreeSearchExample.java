package treesample;

public class TreeSearchExample {

    // This method searches for a value in a BST recursively
    public static boolean searchBST(TreeNode root, int target) {
        if (root == null) return false;       // base case: reached leaf

        if (root.val == target) return true;  // found the target

        if (target < root.val) {
            // target is smaller, search left subtree
            return searchBST(root.left, target);
        } else {
            // target is larger, search right subtree
            return searchBST(root.right, target);
        }
    }

    public static void main(String[] args) {
        // Step 1: Create a simple BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        // Step 2: Search for some values
        int target1 = 7;
        int target2 = 8;

        System.out.println("Searching for " + target1 + ": " + (searchBST(root, target1) ? "Found" : "Not Found"));
        System.out.println("Searching for " + target2 + ": " + (searchBST(root, target2) ? "Found" : "Not Found"));
    }
}