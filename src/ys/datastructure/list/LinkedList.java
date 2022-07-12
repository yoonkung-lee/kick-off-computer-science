package ys.datastructure.list;

public interface LinkedList {

    public void addHead(Object obj);

    public void addMiddle(Object obj , int index);

    public void remove(Object obj);

    public int size();

    public Object get(int index);
}
