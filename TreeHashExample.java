package treesample;

import java.util.HashMap;

public class TreeHashExample {

    // This method traverses the tree and hashes nodes into a HashMap
    public static void hashTree(TreeNode root, HashMap<Integer, TreeNode> map) {
        if (root == null) return; // base case

        // Add current node to hash map with value as key
        map.put(root.val, root);

        // Recurse on left subtree
        hashTree(root.left, map);

        // Recurse on right subtree
        hashTree(root.right, map);
    }

    public static void main(String[] args) {
        // Step 1: Create a simple binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        // Step 2: Create a HashMap to store nodes
        HashMap<Integer, TreeNode> nodeMap = new HashMap<>();

        // Step 3: Hash the tree nodes
        hashTree(root, nodeMap);

        // Step 4: Display hashed nodes
        System.out.println("Hashed nodes in tree (key = node value):");
        for (Integer key : nodeMap.keySet()) {
            System.out.println("Key: " + key + ", Node: " + nodeMap.get(key));
        }

        // Step 5: Example lookup
        int lookup = 7;
        if (nodeMap.containsKey(lookup)) {
            System.out.println("Node " + lookup + " exists in the tree. Node object: " + nodeMap.get(lookup));
        } else {
            System.out.println("Node " + lookup + " not found in the tree.");
        }
    }
}
