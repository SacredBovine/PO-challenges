import challenges.ChallengeOne;
import models.LLNode;
import models.LinkedList;
import challenges.ChallengeOne;
import challenges.ChallengeTwo;

public class Driver {
        private static LinkedList list1 = new LinkedList<>();
        private static LinkedList list2 = new LinkedList<>();
        private static LinkedList list3 = new LinkedList<>();
        private static ChallengeOne c1;
        private static ChallengeTwo c2;

    public static void main(String[] args){


        LLNode<Integer> node1 = new LLNode<>(1);
        LLNode<Integer> node2 = new LLNode<>(2);
        LLNode<Integer> node3 = new LLNode<>(3);
        LLNode<Integer> node4 = new LLNode<>(4);
        LLNode<Integer> node5 = new LLNode<>(5);
        LLNode<Integer> node6 = new LLNode<>(6);

        list1.append(node1);
        list1.append(node2);
        list1.append(node3);
        list1.append(node4);
        list1.append(node5);
        list1.append(node6);
        list2.append(node3);
        list2.append(node4);
        list2.append(node5);
        list2.append(node6);

        c1 = new ChallengeOne(list1,list2);
        System.out.println("lists intersect at node: " + c1.findIntersection());

        LLNode<Character> nodea = new LLNode<>('a');
        LLNode<Character> nodeb = new LLNode<>('b');
        LLNode<Character> nodec = new LLNode<>('c');
        LLNode<Character> noded = new LLNode<>('d');
        LLNode<Character> nodee = new LLNode<>('e');
        LLNode<Character> nodef = new LLNode<>('f');

        list3.append(nodea);
        list3.append(nodeb);
        list3.append(nodec);
        list3.append(noded);
        list3.append(nodee);
        list3.append(nodef);
        list3.append(nodec);

        c2 = new ChallengeTwo(list3);
        System.out.println("Head of broken Linked List is at node: " + c2.findHead());




    }
}
