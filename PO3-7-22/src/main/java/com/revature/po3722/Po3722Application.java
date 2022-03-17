package com.revature.po3722;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class Po3722Application {

    public static void main(String[] args) {
        SpringApplication.run(Po3722Application.class, args);
        final int limit = 4000000;
        int i = 0;
        boolean flag = true;
        List<Integer> evenFibs= new LinkedList();

        while(flag){
            i += 1;
            int temp = FibCalc.calculateFib(i);
            if (temp < limit) {
                if(temp % 2 == 0) evenFibs.add(temp);
            }
            else flag = false;
        }

        long sum = evenFibs.stream().mapToLong(Integer::longValue).sum();

        System.out.println("Sum of even fibonacci numbers less than 4,000,000: " + sum);
    }

}
