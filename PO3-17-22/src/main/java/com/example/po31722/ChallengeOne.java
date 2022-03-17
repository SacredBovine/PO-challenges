package com.example.po31722;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ChallengeOne {

    private List<Integer> list1 = new LinkedList();
    private List<Integer> list2 = new LinkedList();

    public ChallengeOne(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public int findIntersection(){
       Iterator it1 = list1.iterator();
       Iterator it2 = list2.iterator();
       while (it1.hasNext() && it2.hasNext()) {
           int a = (int) it1.next();
           int b = (int) it2.next();
           if (a == b) {
               return a;
           }
       }
       return -1;
    }
}
