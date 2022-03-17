package com.example.po31722;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class Po31722Application {

    public static void main(String[] args) {

        SpringApplication.run(Po31722Application.class, args);

        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> list2 = new LinkedList();

        list1.add(3);
        list1.add(7);
        list1.add(8);
        list1.add(10);

        list2.add(99);
        list2.add(1);
        list2.add(8);
        list2.add(10);

        ChallengeOne c1 = new ChallengeOne(list1, list2);
        System.out.println("Intersecting node: " + c1.findIntersection());

        ChallengeTwo c2 = new ChallengeTwo(list1);
        System.out.println("stack: ");
        c2.printStack();
        System.out.println("stack max: " + c2.findMax());
        c2.push(11);
        System.out.println("pushed to stack");
        c2.printStack();


        System.out.println("stack max: " + c2.findMax());

        System.out.println("popped: " + c2.pop());
        System.out.println("popped: " + c2.pop());
        System.out.println("popped: " + c2.pop());
        System.out.println("popped: " + c2.pop());
        System.out.println("popped: " + c2.pop());

        try {
            c2.pop();
        } catch (NullPointerException e) {
                System.out.println(e.getMessage());
        }

        try {
            c2.findMax();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }
}
