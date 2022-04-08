package com.revature.pochallenges;

import com.revature.pochallenges.model.CircularArray;

public class Main {

    public static void main(String[] args){
        Integer[] intTest = {1,2,3,4,5};
        String[] stringTest = {"a","b","c","d","e"};
        CircularArray<Integer> array1 = new CircularArray(intTest);

        System.out.println("initial array: "+ array1.toString());
        array1.rotateRight();
        System.out.println("rotate right: " + array1.toString());
        array1.rotateRight();
        System.out.println("rotate right: " + array1.toString());

        CircularArray<String> array2 = new CircularArray(stringTest);
        System.out.println("initial array: "+ array2.toString());
        array2.rotateLeft();
        System.out.println("rotate left: " + array2.toString());
        array2.rotateLeft();
        System.out.println("rotate left: " + array2.toString());
        System.out.println("get index 0: " + array2.get(0));
        System.out.println("get index 3: " + array2.get(3));
        System.out.println("get index 4: " + array2.get(4));

        array2.set(3, "foo");
        System.out.println("Set index 3 to = \"foo\": " + array2.toString());
        System.out.println();
        System.out.println("demonstration of circular iteration:");
        for (int i = 0; i < 25; i++){
            System.out.println(array2.next().toString());
        }


    }
}
