package utils.priorityQueue;

public class Node <T> {

    private Node<T> nextNode;
    private T value;

    public Node(T value){
        this.value = value;
    }

    public Node(T value, Node<T> nextNode){
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
