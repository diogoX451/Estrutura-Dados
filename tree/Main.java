package tree;

public class Main {
    public static void main(String[] args) {
        new BinaryTree();

        BinaryTree.add(5);
        BinaryTree.add(3);
        BinaryTree.add(8);
        BinaryTree.add(7);

        System.out.println(BinaryTree.root.value);
    }
}
