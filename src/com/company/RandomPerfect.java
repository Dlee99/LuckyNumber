package com.company;
import java.util.Random;
/**
 * Created by dl447 on 10/10/16.
 */
public class RandomPerfect {
    Random rand = new Random();
    private int randInt;
    public int randomInteger() {
        randInt = rand.nextInt(1000);
        randInt = randInt * randInt;
        return randInt;
    }
}
