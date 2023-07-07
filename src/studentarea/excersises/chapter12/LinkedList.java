package lecture.chapter11;

public class LinkedList<T> {

    private Node firstNode;

    private int size = 0; // könnte vergessen werden -> inkonsistensen; allerdings performanter als durchzuzählen

    void add(T data){
        Node newNode = new Node(data);
        size++;

        if(firstNode == null){
            firstNode = newNode;
            return;
        }

        Node currentNode = firstNode;
        while (currentNode.nextNode != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);

    }

    private boolean indexInList(int index){
        if(Math.abs(index) > size() - 1){
            return false;
        }
        return true;
    }

    public void printList(){
        Node nextNode = firstNode;

        while(nextNode != null){
            System.out.println(nextNode.getData());
            nextNode = nextNode.getNextNode();
        }
    }

    public void printListRecursive(){
        printListRecursive(firstNode);
    }

    private void printListRecursive(Node node){
        if(node != null){
            System.out.println(node.getData());
            printListRecursive(node.getNextNode());
        }
    }

    public T get(int index){
        if(!indexInList(index)){
            return null;
        }
        if(index < 0){
            index = size + index;
        }

        Node currentNode = firstNode;
        for(int i = 0; i<index;i++){
            currentNode = currentNode.getNextNode();
        }

        return currentNode.data;
    }


    public void setData(int index,T data ) throws IndexOutOfBoundsException {
        if(!indexInList(index)){
            throw new IndexOutOfBoundsException();
        }

        if(index < 0){
            index = size + index;
        }

        Node currentNode = firstNode;
        for(int i = 0; i<index;i++){
            currentNode = currentNode.getNextNode();
        }
        currentNode.data = data;
    }

    public boolean contains(T data){

        Node currentNode = firstNode;
        while (currentNode.nextNode != null){
            if(currentNode.data.equals(data)){
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }


    public boolean remove(T data){
        if(firstNode.data.equals(data)){
            firstNode = firstNode.nextNode;
            size--;
            return true;
        }

        Node previous = firstNode;
        Node current = firstNode.nextNode;

        while(current != null){
            if(current.data.equals(data)){
                previous.setNextNode(current.nextNode);
                size--;
                return true;
            }
            previous = current;
            current = current.nextNode;
        }

        return false;
    }

    public int size(){
        return size;
    }

    private class Node{
        T data;
        Node nextNode;

        Node(T data){
            this.data = data;
        }

        T getData(){
            return data;
        }

        void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        Node getNextNode(){
            return nextNode;
        }


    }


}
