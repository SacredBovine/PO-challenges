package com.revature.po3722;

public class FibCalc {

    public static int calculateFib(int n){
        if (n > 1) return calculateFib(n-1) + calculateFib(n-2);
        else if (n == 1) return 1;
        else return 0;
    }
}
