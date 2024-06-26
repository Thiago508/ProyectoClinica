package utils.priorityQueue;

import model.Cita;

public class CitaPriorityQueue {

    private Node<Cita> firstNode;
    private int size;

    public CitaPriorityQueue(){
        this.firstNode = null;
        this.size = 0;
    }

    public void enqueue(Cita value) {
        Node<Cita> newNode = new Node<>(value);

        Node<Cita> node = firstNode;
        Node<Cita> nextNode;

        if (node == null){
            firstNode = newNode;
            return;
        }

        if (newNode.getValue().getPaciente().getGrupoPoblacional().getPrioridad().getValue() < node.getValue().getPaciente().getGrupoPoblacional().getPrioridad().getValue()){
            newNode.setNextNode(node);
            firstNode = newNode;
            return;
        }

        while (newNode.getValue().getPaciente().getGrupoPoblacional().getPrioridad().getValue() >= node.getValue().getPaciente().getGrupoPoblacional().getPrioridad().getValue() && node.getNextNode() != null){
            if (node.getNextNode().getValue().getPaciente().getGrupoPoblacional().getPrioridad().getValue() > newNode.getValue().getPaciente().getGrupoPoblacional().getPrioridad().getValue()) {
                break;
            }
            node = node.getNextNode();
        }

        nextNode = node.getNextNode();
        newNode.setNextNode(nextNode);
        node.setNextNode(newNode);

        size++;
    }

    public Cita unqueue(){

        if (isEmpty()){
            return firstNode.getValue();
        }

        Node<Cita> node = firstNode;

        firstNode = node.getNextNode();
        size--;

        return node.getValue();
    }

    public boolean isEmpty(){
        return(firstNode == null);
    }

    public Cita front(){
        return firstNode.getValue();
    }

    public int size(){
        return size;
    }

}
