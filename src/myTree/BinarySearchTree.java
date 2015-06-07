package myTree;

/**
 * @author guycao allow duplicates in binary search tree. a node with equal
 *         value will go to right subtree
 *
 */
public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private TreeNode insert(int value, TreeNode node) {
        if (node == null) {
            node = new TreeNode(value);
        } else if (value < node.getValue()) {
            node.left = insert(value, node.left);
        } else if (value > node.getValue()) {
            node.right = insert(value, node.right);
        }
        return node;
    }

    public TreeNode getRoot() {
        return root;
    }

    public int getTreeHeight() {
        return BinarySearchTree.getTreeHeight(this.root);
    }

    // STATIC FUNCTIONS /////////////////////////////////////////////////////
    public static BinarySearchTree buildRandomTree(int numberNodes) {
        BinarySearchTree newTree = new BinarySearchTree();
        for (int i = 0; i < numberNodes; i++) {
            int newValue = (int) (Math.random() * 100);
            newTree.insert(newValue);
        }
        return newTree;
    }

    public static int getTreeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = BinarySearchTree.getTreeHeight(node.left);
            int rightHeight = BinarySearchTree.getTreeHeight(node.right);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }
}
