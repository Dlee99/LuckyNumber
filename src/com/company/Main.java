package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        RandomPerfect randPerf = new RandomPerfect();
        Scanner sc = new Scanner(System.in);
        Scanner integer = new Scanner(System.in);
        String name, userNumber, userList = "";
        int randInt, x = 1;
        while(x == 1) {
            System.out.println("Please input a name");
            name = sc.nextLine();
            randInt = randPerf.randomInteger();
            userNumber = name + "\t\t\t\t" + randInt + "\n";
            userList = userList + userNumber;
            System.out.println("Would you like to stop the program (0), input a new name (1), or get a list of names (2)?");
            x = integer.nextInt();
            if(x == 2){
                System.out.println(userList);
                System.out.println("Would you like to input a new name? Y || N");
                String newName = sc.nextLine();
                newName = newName.toLowerCase();
                if(newName.equals("y")){
                    x = 1;
                }
            }
            else if(x == 0){
                System.out.println(userList);
            }
        }
    }
}
