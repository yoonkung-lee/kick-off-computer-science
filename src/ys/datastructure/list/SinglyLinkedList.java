package ys.datastructure.list;

public class SinglyLinkedList implements LinkedList {

    private Node head;
    private int size;

    public SinglyLinkedList(Object object) {
        Node node = new Node(object);
        head = node;
        size = 1;
    }


    @Override
    public void addHead(Object obj) {
        Node tempHead = new Node(obj);
        Node head = getHead();
        tempHead.setLink(head);
        setHead(tempHead);
        size++;
    }

    @Override
    public void addMiddle(Object object, int index) {
        if(index > size -1) {
            System.out.println("최대 개수가 넘어간 index를 입력했습니다.");
        } else {
            Node newNode = new Node(object);
            Node temp1 = head;
            for (int i = index-1; i == 0; i--) {
                temp1 = temp1.getLink();
            }
            Node temp2 = temp1.getLink();
            temp1.setLink(newNode);
            newNode.setLink(temp2);
            size++;
        }
    }

    @Override
    public void add(Object object) {
        Node temp = head;
        Node newNode = new Node(object);
        while(temp.getLink() != null) {
            temp = temp.getLink();
        }
        temp.setLink(newNode);
        size++;
    }

    @Override
    public void remove(int index) {
        if ( index > size-1) {
            System.out.println("해당하는 인덱스에 데이터가 없습니다.");
        } else {
            Node temp1 = head;
            for (int i = index-1; i == 0; i--) {
                temp1 = temp1.getLink();
            }
            Node temp2 = temp1.getLink();
            Node temp3 = temp2.getLink();
            temp1.setLink(temp3);
            size--;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        Object result = null;
        if ( index > size-1) {
            System.out.println("해당하는 인덱스에 데이터가 없습니다.");
        } else {
            Node temp1 = head;
            for (int i = 0; i > index; i++) {
                temp1 = temp1.getLink();
            }
            result =  temp1.getData();
        }
        return result;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
