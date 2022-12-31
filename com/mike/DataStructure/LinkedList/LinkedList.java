package com.mike.DataStructure.LinkedList;

public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) head = newNode;
        else {
            Node travel = head;
            while (travel.next != null) {
                travel = travel.next;
            }
            travel.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) head = newNode;
        else {
            Node temp = head;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAt(int position, int data) {
        Node temp = head;
        Node newNode = new Node();
        newNode.data = data;
        if (position == 0) {
            addFirst(data);
        } else {
            while (temp.next != null && position != 1) {
                temp = temp.next;
                position--;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    public void show() {
        if (head == null) System.out.println("No data!");
        else {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public void deleteFirst() {
        if (head == null) System.out.println("Overflow");
        else {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) System.out.println("Overflow!");
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteAt(int position) {
        if (position == 0) deleteFirst();
        else {
             Node temp = head;
             while(position>1){
                 temp=temp.next;
                 position--;
             }
             temp.next=temp.next.next;
        }
    }
}
