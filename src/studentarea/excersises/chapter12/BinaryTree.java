package lecture.chapter11;

public class BinaryTree<T extends Comparable> {

    private Node root;
    private int size = 0;


    private class Node {
        private Node leftNode;
        private Node rightNode;
        private T data;

        Node(T data){
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }

    public boolean add(T data){
        if(root == null){
            root = new Node(data);
            size++;
            return true;
        }

        if(add(data, root)){
            size++;
            return true;
        }
        return false;
    }

    private boolean add(T data, Node currentNode){
        int res = currentNode.getData().compareTo(data);

        if(res < 0){ // current Node is smaller than data
            if(currentNode.rightNode == null){
                currentNode.setRightNode(new Node(data));
                return true;
            }
            return add(data, currentNode.rightNode);
        }else if(res > 0){ // current Node is larger than data
            if(currentNode.leftNode == null){
                currentNode.setLeftNode(new Node(data));
                return true;
            }
            return add(data, currentNode.leftNode);
        }else{
            return false;
        }
    }



    public int size(){
        return size;
    }

}
