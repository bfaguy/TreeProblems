package myTree;

public class TreeNode {
    private int value;
    
    // what is cost / benefit of using private and package here? 
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.setValue(value);
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
}

