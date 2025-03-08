package assignment2;
public void inOrderTraverse() {
    inOrderRec(root);
}

private void inOrderRec(Node root) {
    if (root != null) {
        inOrderRec(root.left);
        System.out.println(root.data);
        inOrderRec(root.right);
    }
}
