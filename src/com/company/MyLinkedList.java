package com.company;

public class MyLinkedList {

    private ListNode front;

    public MyLinkedList(){
        front = null;
    }

    public void add(Player player){
        if(front == null){
            front = new ListNode(player);
        } else {
            ListNode current = front;
            while(current.next != null){
                current = current.next;
            }
            current.next = new ListNode(player);
        }

    }

    public String toString(){
        if(front == null){
            return "[]";
        } else {
            Player result = "[" + front.data.toString();
            ListNode current = front.next;
        }
    }

}
