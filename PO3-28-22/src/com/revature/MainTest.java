package com.revature;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static Main main;
    private static int maxIntVal = 1000;

    @BeforeEach
    public void setup(){
        this.main = new Main();
    }

    @Test
    void solutionsMatchTest() {
        for (int testCase = 1; testCase <= maxIntVal; testCase++){
            System.out.println(testCase);
            assertEquals(main.programmaticSolution(testCase), main.mathematicalSolution(testCase));
        }
    }


}