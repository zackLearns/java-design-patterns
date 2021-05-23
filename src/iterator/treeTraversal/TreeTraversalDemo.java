package iterator.treeTraversal;

public class TreeTraversalDemo {

    public static void main(String[] args) {

        Node<Integer> root = new Node<>(1,
                new Node<>(2),
                new Node<>(3));

        InOrderIterator<Integer> inOrderIterator = new InOrderIterator<>(root);

        while(inOrderIterator.hasNext()) {
            System.out.print("" + inOrderIterator.next() + ",");
        }

        System.out.println();

        BinaryTree<Integer> tree = new BinaryTree<>(root);
        for (int n : tree)
            System.out.print("" + n + ",");
        System.out.println();
    }
}
