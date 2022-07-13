package ys.datastructure.list;

public interface LinkedList {

    public void addHead(Object obj);

    public void addMiddle(Object obj , int index);

    public void add(Object obj);

    public void remove(int index);

    public int size();

    public Object get(int index);
}
