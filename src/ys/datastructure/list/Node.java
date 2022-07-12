package ys.datastructure.list;

public class Node<T> {

    private T data;
    private Node link;

    public Node (T obj) {
        setData(obj);
    }

    public Node (T obj , Node link) {
        setData(obj);
        setLink(link);
    }

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }

}
