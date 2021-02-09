package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Scanner scan = new Scanner(System.in);

        int svar = 1;

        while(svar != 0) {
            System.out.println();
            System.out.println("Press 1 to create player");
            System.out.println("Press 2 to list all players");
            System.out.println("Press 3 to search for a player");
            System.out.println("Press 4 to delete a player");
            System.out.println("Press 5 to search for 1st team players");
            System.out.println("Press 6 to search for 2st team players");
            System.out.println("Press 7 to search within an age interval");
            System.out.println("Press 0 to end program");

            svar = scan.nextInt();

            switch (svar){
                case 0:
                    System.out.println("Ending program");
                    break;
                case 1:
                    createPlayer(scan, list);
                    break;
                case 2:
                    listAllPlayers();
                    break;
                case 3:
                    searchPlayers();
                    break;
                case 4:
                    deletePlayer();
                    break;
                case 5:
                    search1Team();
                    break;
                case 6:
                    search2Team();
                    break;
                case 7:
                    searchInterval();
                    break;

            }
        }
    }

    private static void searchInterval() {
    }

    public static void createPlayer(Scanner scan, MyLinkedList list) {
        System.out.print("Type the players first name: ");
        String f = scan.next();
        System.out.print("Type the players last name: " );
        String l = scan.next();
        System.out.print("Type the players age: ");
        int a = scan.nextInt();
        System.out.print("1'st or 2'nd team: ");
        int t = scan.nextInt();

        Player p = new Player(f,l,a,t);
        list.add(p);
        System.out.println(list);

    }
    public static void listAllPlayers(){

    }
    public static void searchPlayers(){

    }
    public static void deletePlayer(){

    }
    public static void search1Team(){

    }
    public static void search2Team(){


    }
}
