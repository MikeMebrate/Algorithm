package com.mike.DataStructure.LinkedList;

public class Runnable {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.deleteAt(1);
        list.show();
    }
}
