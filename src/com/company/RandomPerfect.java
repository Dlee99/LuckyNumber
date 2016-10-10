package com.company;
import java.util.Random;
import java.util.Scanner;
/**
 * Created by dl447 on 10/10/16.
 */
public class RandomPerfect {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    private String name;
    private int randInt;
    public String userNumber;
    public RandomPerfect(){
        name = sc.nextLine();
        randInt = rand.nextInt();
        userNumber = name + "\t" + randInt;
    }
}
