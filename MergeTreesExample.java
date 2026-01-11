package treesample;

public class MergeTreesExample {

    // This method merges two BSTs into one
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // Base cases
        if (t1 == null) return t2; // if first tree is empty, return second
        if (t2 == null) return t1; // if second tree is empty, return first

        // Merge root nodes
        t1.val += t2.val; // combine values, can be adapted depending on problem

        // Recursively merge left children
        t1.left = mergeTrees(t1.left, t2.left);

        // Recursively merge right children
        t1.right = mergeTrees(t1.right, t2.right);

        return t1; // return merged tree
    }

    // Utility method to print tree in-order (left, root, right)
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        // Step 1: Create first tree
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(3);
        tree1.right = new TreeNode(2);
        tree1.left.left = new TreeNode(5);

        // Step 2: Create second tree
        TreeNode tree2 = new TreeNode(2);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(3);
        tree2.left.right = new TreeNode(4);
        tree2.right.right = new TreeNode(7);

        System.out.print("Tree1 In-Order: ");
        printInOrder(tree1);
        System.out.println();

        System.out.print("Tree2 In-Order: ");
        printInOrder(tree2);
        System.out.println();

        // Step 3: Merge trees
        TreeNode mergedTree = mergeTrees(tree1, tree2);

        System.out.print("Merged Tree In-Order: ");
        printInOrder(mergedTree);
        System.out.println();
    }
}
