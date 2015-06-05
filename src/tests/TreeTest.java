package tests;
import myTree.BinarySearchTree;

import org.junit.Test;

public class TreeTest {

    @Test
    public void testTreeHeigt() {
        BinarySearchTree tree = BinarySearchTree.buildRandomTree(5);
        System.out.println("tree height:" + tree.getTreeHeight());
    }
    
    public void testLookup() {
        BinarySearchTree tree = new BinarySearchTree(); 
        tree.insert(4);
        //assertEquals(4, tree.lookup(4).getValue());
    }

}
