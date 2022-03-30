package com.revature;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Please set number of lockers to test with here
        final int numOfLockers = 100;

        boolean[] doors = new boolean[numOfLockers];

        for (int step = 1; step <= numOfLockers; step += 1){
            for (int locker = step - 1; locker < numOfLockers; locker += step){
                doors[locker] = !doors[locker];
            }
        }

        int count = 0;
        for(boolean out: doors) if(out) count++;

        System.out.println();
        System.out.println("case : Number of lockers = " + numOfLockers);
        System.out.println("Programmatic solution: There are " + count + " open lockers.");
        System.out.println("Mathematical solution: There are " + (int) Math.sqrt(numOfLockers) +" open lockers.");

        // the step between open doors increases by 2 each open door in the case that step += 1
        // Can this be generalized to step constraints?
        //      stepping by 2 gets all funky, maybe not generalizable
        //      stepping by 3 is even more funky.
        // Let's just generalize the step by 1 solution to arbitrary number of lockers.
        // every locker # that is a perfect square is open.
        // Will try (no promises) to find a series solution to explain

        // 100-120 -> 10 open lockers
        // 121-143 -> 11 open lockers
        // 144-168 -> 12 open lockers
        // # open lockers -> integer value of sqrt(numOfLockers)
        // todo Mathemagic
    }
}
