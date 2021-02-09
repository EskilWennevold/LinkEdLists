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

    public Player getPlayer() {
        return data;
    }

    public void setPlayer(Player player) {
        this.data = player;
    }


}
