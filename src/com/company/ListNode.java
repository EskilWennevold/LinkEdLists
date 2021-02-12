package com.company;

public class ListNode {
    private Player data;
    public ListNode next;


    public ListNode(Player player){
        this(player, null);
    }

    public ListNode(Player player, ListNode next){
        data = player;
        this.next = next;
    }

    public Player getData() {
        return data;
    }
    public void setData(Player player) {
        this.data = player;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public String toString() {
        return data.toString();

    }

}
