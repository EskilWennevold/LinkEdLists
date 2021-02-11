package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        MyLinkedList list = new MyLinkedList();
        Scanner scan = new Scanner(System.in);
        loadFile(list);
        mainMenu(scan, list);
        list.toFile();
    }

    public static void mainMenu(Scanner scan, MyLinkedList list){

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
                list.getPlayers();
                break;
            case 3:
                searchPlayers(list, scan);
                break;
            case 4:
                deletePlayer(scan, list);
                break;
            case 5:
                search1Team(list);
                break;
            case 6:
                search2Team(list);
                break;
            case 7:
                searchInterval(scan, list);
                break;

            }
        }
    }
    private static void searchInterval(Scanner scan, MyLinkedList list) {
        System.out.println("Type in the minimal age in the interval you want to search for: ");
        int minAge = scan.nextInt();
        System.out.println("Type int tha maximum age in the interval you want to search for: ");
        int maxAge = scan.nextInt();
        list.getInterval(minAge, maxAge);
    }
    public static void loadFile(MyLinkedList list) throws FileNotFoundException {
        Scanner load = new Scanner(new File("players.txt"));
        while (load.hasNextLine()) {
            String line = load.nextLine();
            Scanner lineScan = new Scanner(line);
            String fname = lineScan.next();
            String lname = lineScan.next();
            int age = lineScan.nextInt();
            int team = lineScan.nextInt();
            Player p1 = new Player(fname, lname, age, team);
            list.add(p1);
        }
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
    }
    public static void searchPlayers(MyLinkedList list, Scanner scan){
        System.out.println("What is the first name of the player you want to see?");
        String f = scan.next();
        list.getPlayer(f);
    }
    public static void deletePlayer(Scanner scan, MyLinkedList list){
        System.out.println("Type in the first name of the player you want to delete:");
        String f = scan.next();
        list.remove(f);

    }
    public static void search1Team(MyLinkedList list){
        list.getTeam1();
    }
    public static void search2Team(MyLinkedList list){
        list.getTeam2();

    }

}
