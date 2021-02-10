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
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(new ListNode(player));
        }

    }

    public String toString(){
        if(front == null){
            return "[]";
        } else {
            String result ="[" + front.toString();
            ListNode current = front.getNext();
            while(current != null){
                result += current.toString();
                current = current.getNext();
            }
            result += "]";
            return result;
        }

    }



}
