package studentarea.lecture.chapter11;

import org.junit.platform.engine.support.hierarchical.Node;

public class LinkedList<T> {



    private Node firstNode;

    void add(T data){
        Node newNode = new Node (data);

        if(firstNode != null){
            firstNode = newNode;
            return;

        }

        Node currentNode = firstNode;
        while(currentNode.nextNode != null){
            currentNode=  currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }
    
    public T get(int Index){
        return null;
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
