package ys.datastructure.list;

public class SinglyLinkedList implements LinkedList {

    private Node head;
    private int size;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    @Override
    public void addHead(Object obj) {
        if(getHead() == null){
            Node tempHead = new Node(obj);
            setHead(tempHead);
        } else {
            Node tempHead = new Node(obj);
            Node head = getHead();
            tempHead.setLink(head);
            setHead(tempHead);
        }
    }

    @Override
    public void addMiddle(Object obj, int index) {

    }

    @Override
    public void remove(Object obj) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object get(int index) {
        return null;
    }
}
