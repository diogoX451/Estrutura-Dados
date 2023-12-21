package tree;

public class BinaryTree {
    static Node root;

    private static Node recursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = recursive(current.left, value);
        } else if (value > current.value) {
            current.right = recursive(current.right, value);
        }

        return current;
    }

    public static void add(int value) {
        root = recursive(root, value);
    }
}
