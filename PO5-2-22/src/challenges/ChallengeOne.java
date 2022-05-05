package challenges;

import java.util.Iterator;

import models.LLNode;
import models.LinkedList;

public class ChallengeOne {

    private LinkedList list1 ;
    private LinkedList list2 ;

    public ChallengeOne(LinkedList list1, LinkedList list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public LLNode findIntersection(){
        LLNode node1 = list1.gethead();
        LLNode node2 = list2.gethead();
        if(list1.getSize() > list2.getSize()) {
            for (int i = 0; i < list1.getSize() - list2.getSize(); i++) {
                node1 = node1.getNext();
            }
        } else if (list1.getSize() < list2.getSize()) {
            for (int i = 0; i < list2.getSize() - list1.getSize(); i++) {
                node2 = node2.getNext();
            }
        }
        do {
            if( node1 != null && node1.equals(node2)) return node1;
            else {
                node1 = node1.getNext();
                node2 = node2.getNext();
            }
        } while (node1.hasNext() && node2.hasNext());
        return null ;
    }
}