package com.revature;

public class Main {

    public static int programmaticSolution(int numOfLockers){
        boolean[] doors = new boolean[numOfLockers];

        for (int step = 1; step <= numOfLockers; step += 1){
            for (int locker = step - 1; locker < numOfLockers; locker += step){
                doors[locker] = !doors[locker];
            }
        }

        int count = 0;
        for(boolean isOpen: doors) if(isOpen) count++;

        return count;
    }

    public static int mathematicalSolution(int numOfLockers){
        return (int) Math.sqrt(numOfLockers);
    }

    public static void main(String[] args) {

        // Set number of lockers to run with here
        final int numOfLockers = 100;

        System.out.println();
        System.out.println("case : Number of lockers = " + numOfLockers);
        System.out.println("Programmatic solution: There are " + programmaticSolution(numOfLockers) + " open lockers.");
        System.out.println("Mathematical solution: There are " + mathematicalSolution(numOfLockers) + " open lockers.");

    }

    // Can this be generalized to step constraints?
    //      stepping by 2 gets all funky, maybe not generalizable
    //      stepping by 3 is even more funky.
    // Let's just generalize the step by 1 solution to arbitrary number of lockers.
    // every locker # that is a perfect square is open.
    // Will try (no promises) to find a series/set solution to explain
    // update - I don't know how to provide a formal proof.

    // 100-120 -> 10 open lockers
    // 121-143 -> 11 open lockers
    // 144-168 -> 12 open lockers
    // # open lockers -> integer value of sqrt(numOfLockers)
    //
    // created test to compare both functions, I ran it from 1 - 1,000,00 at passed.
    // Wouldn't recommend as that took 2 hours.

}
