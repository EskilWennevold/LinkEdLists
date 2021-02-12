package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

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
    public void getPlayer(String f){
        if(front != null){
            if(front.getData().getFname().equalsIgnoreCase(f)){
                System.out.println(front);
            }
            ListNode current = front;
            while(current.next != null){
                if(current.next.getData().getFname().equalsIgnoreCase(f)){
                    System.out.println(current.next);
                }
                current = current.next;
            }
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
    public void getInterval(int minAge, int maxAge) {
        if(front.getData().getAge() >= minAge && front.getData().getAge() <= maxAge){
            System.out.println(front.getData().getFname() + " " + front.getData().getLname() + " " + front.getData().getAge());
        }
        ListNode current = front;
        while(current.next != null){
            if(current.next.getData().getAge() >= minAge && current.next.getData().getAge() <= maxAge){
                System.out.println(current.next.getData().getFname() + " " + current.next.getData().getLname() + " " + current.next.getData().getAge());
            }
            current = current.next;
        }
    }
    public void toFile() throws FileNotFoundException {
        if(front != null) {
        PrintStream p1 = new PrintStream(new File("players.txt"));
            String fName = front.getData().getFname();
            String lName = front.getData().getLname();
            int age = front.getData().getAge();
            int team = front.getData().getTeam();
            String line = fName + " " + lName + " " + age + " " + team;
            p1.println(line);
            ListNode current = front;
            while(current.next != null){
                fName = current.next.getData().getFname();
                lName = current.next.getData().getLname();
                age = current.next.getData().getAge();
                team = current.next.getData().getTeam();
                String line1 = fName + " " + lName + " " + age + " " + team;
                p1.println(line1);
                current = current.next;
            }
        }
    }
    public void getTeam1(){
        if(front == null){
            System.out.println("This list is empty");
        } else {
            if(front.getData().getTeam() == 1){
                System.out.println(front.getData().getFname() + " " + front.getData().getLname());
            }
            ListNode current = front;
            while(current.next != null){
                if(current.next.getData().getTeam() == 1){
                    System.out.println(current.next.getData().getFname() + " " + current.next.getData().getLname());
                }
                current = current.next;
            }
        }

    }
    public void getTeam2(){
        if(front == null){
            System.out.println("This list is empty");
        } else {
            if(front.getData().getTeam() == 2){
                System.out.println(front.getData().getFname() + " " + front.getData().getLname());
            }
            ListNode current = front;
            while(current.next != null){
                if(current.next.getData().getTeam() == 2){
                    System.out.println(current.next.getData().getFname() + " " + current.next.getData().getLname());
                }
                current = current.next;
            }
        }

    }
}
