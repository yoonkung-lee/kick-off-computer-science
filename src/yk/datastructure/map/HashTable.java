package yk.datastructure.map;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class HashTable<String, E> implements MyMap<String, E>{
    //Collision 대비 linkedList로 구현
    private class Node{
        String key;
        E value;

        private Node(String key,E value){
            this.key = key;
            this.value = value;
        }
        private E value(){
            return this.value;
        }
        private void value(E value){
            this.value = value;
        }
    }
    //Node inner Class End.

    int size = 5;
    private LinkedList<Node>[] rooms = new LinkedList[size];
    /*HashTable(int size){
        this.data = new LinkedList[size];
    }*/

    // 메서드 start
    protected int getHashCode(String key) {
        int hashCode = 0;

        // hash Func
        for(char c : key.toString().toCharArray()){
            hashCode += c;
        }
        return hashCode;
    }

    private int convertToIndex(int hashCode){
        return hashCode % rooms.length;
    }

    private Node searchKey(LinkedList<Node> list, String key){
        if(list == null) return null;
        for(Node node : list){
            if(node.key.equals(key)){
                return node;
            }
        }
        return null;
    }

    // 추가
    public void put(String key, E value) {
        int index = getIndexOfRooms(key);
        LinkedList<Node> list = rooms[index];

        if(list == null){
            list = new LinkedList<Node>();
            rooms[index] = list;
        }

        Node node = searchKey(list, key); // list null 처리 되어있음.
        if(node == null){
            list.addLast(new Node(key, value));
        }else {
            node.value(value);
        }
    }

    // 반환
    public Object get(String key) {
        int index = getIndexOfRooms(key);
        LinkedList<Node> list = rooms[index];

        Node node = searchKey(list, key);
        return node == null? null : node.value();
    }

    // 제거
    public boolean remove(String key) {
        int index = getIndexOfRooms(key);
        LinkedList<Node> list = rooms[index];

        Node delNode = searchKey(list, key);
        return list.remove(delNode);
    }

    // 수정
    public void replace(String key, E value) {
        put(key, value);
    }

    // 방 주소 찾기
    private int getIndexOfRooms(String key){
        int hashCode = getHashCode(key);
        return convertToIndex(hashCode);
    }

    // 포함 여부
    public boolean contains(String key) {
        Object searchValue = get(key);
        return searchValue == null? false : true;
    }

    // 전체 삭제
    public void clear() {
        for(LinkedList<Node> room : rooms){
            room.clear();
        }
    }
    //메서드 end.
}
