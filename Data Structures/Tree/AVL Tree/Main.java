public class Main {
    public static void main(String[] args) {
        AVL newAVLTree = new AVL();
        newAVLTree.insert(5);
        newAVLTree.insert(10);
        newAVLTree.insert(15);
        newAVLTree.insert(20);
        newAVLTree.insert(25);
        newAVLTree.levelOrder();
        System.out.println();
        newAVLTree.delete(25);
        newAVLTree.levelOrder();
    }
}