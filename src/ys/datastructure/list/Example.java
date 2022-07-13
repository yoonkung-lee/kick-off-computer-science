package ys.datastructure.list;

public class Example {

    public static void main(String[] args) {
        LinkedList linkedListA = new SinglyLinkedList("하하3");
        linkedListA.addHead("하하2");
        linkedListA.addHead("하하1");
//        linkedListA.addMiddle("하하인덱스" ,2);

        System.out.println("linkedListA.size() = " + linkedListA.size());

        for ( int i = 0; i < linkedListA.size()-1; i++) {
            System.out.println(linkedListA.get(i));
        }


    }
}
