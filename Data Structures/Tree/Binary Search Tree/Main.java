public class Main {
    public static void main(String[] args) {
        BinarySearchTree newTree = new BinarySearchTree();
        newTree.insert(70);
        newTree.insert(50);
        newTree.insert(90);
        newTree.insert(30);
        newTree.insert(60);
        newTree.insert(80);
        newTree.insert(100);
        newTree.insert(25);
        newTree.insert(20);
        newTree.levelOrder();
        System.out.println();
        newTree.delete(25);
        newTree.levelOrder();
    }
}