public class Tree {
    public Node root;

    public Node find(int key) {
        Node current = root;
        while (current.num != key) {
            if (key < current.num) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) return null;
        }
        return current;
    }

    public void insert(int n) {
        Node node = new Node();
        node.num = n;
        if (root == null) root = node;
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (n < current.num) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.leftChild);
            root.display();
            inOrder(root.rightChild);
        }
    }

    public Node min() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node max() {
        Node current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.num != key) {
            parent = current;
            if (key < current.num) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
        }
        if (current == null) return false;
        //нет потомков
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) root = null;
            else if (isLeftChild) parent.leftChild = null;
            else parent.rightChild = null;
        }
        //нету правого потомка
        else if (current.rightChild == null) {
            if (current == root) root = current.leftChild;
            else if (isLeftChild) parent.leftChild = current.leftChild;
            else parent.rightChild = current.leftChild;
        }
        //нету левого потомка
        else if (current.leftChild == null) {
            if (current == root) root = current.rightChild;
            else if (isLeftChild) parent.leftChild = current.rightChild;
            else parent.rightChild = current.rightChild;
        }
        //есть потомки
        else {
            Node successor = getSuccessor(current);
            if (current == root) root = successor;
            else if (isLeftChild) parent.leftChild = successor;
            else parent.rightChild = successor;
            successor.rightChild = current.leftChild;
        }
        return true;
    }

    public Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.leftChild = node.rightChild;
        }
        return successor;
    }

    public int heightOfBinaryTree(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        else
        {
            return 1 +
                    Math.max(heightOfBinaryTree(node.leftChild),
                            heightOfBinaryTree(node.rightChild));
        }
    }
}
