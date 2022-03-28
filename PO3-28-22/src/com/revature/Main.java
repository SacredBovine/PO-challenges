package com.revature;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        boolean[] doors = new boolean[100];
        for (int step = 1; step <= 100; step += 1){
            for (int locker = step - 1; locker < 100; locker += step){
                doors[locker] = !doors[locker];
            }
        }
        int i = 1;
        int count = 0;
        for(boolean out: doors){
            if(out) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("There are " + count +" open lockers.");
        // the step between open doors increases by 2 each open door in the case that step += 1
        // Can this be generalized to step constraints?
        // stepping by 2 gets all funky, maybe not generalizable
        // stepping by 3 is even more funky. Let's just generalize the step by 1 solution to arbitrary number of lockers.

        // todo Mathemagic
    }
}
