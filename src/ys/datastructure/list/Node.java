package ys.datastructure.list;

public class Node {

    private Object data;
    private Node link;

    public Node (Object obj) {
        setData(obj);
    }

    public Node (Object obj , Node link) {
        setData(obj);
        setLink(link);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }

}
