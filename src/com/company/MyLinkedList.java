package com.company;

public class MyLinkedList {

    private ListNode front;

    public MyLinkedList(){
        front = null;
    }
    public void getPlayers(){
        ListNode current = front;
        System.out.println(front.getData().getFname() + " " + front.getData().getLname());
        while(current.next != null){
            System.out.println(current.next.getData().getFname() + " " + current.next.getData().getLname());
            current = current.next;
        }
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
    public void remove(String name){
        if(front != null) {
            ListNode current = front;
            ListNode spot = null;
            while (current.next != null) {
                if (current.next.getData().getFname().equalsIgnoreCase(name)) {
                    spot = current;
                }
                current = current.next;
            }
            if (spot != null) {
                spot.next = spot.next.next;
            } else if (front.getData().getFname().equalsIgnoreCase(name)) {
                front = front.next;
            }
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
