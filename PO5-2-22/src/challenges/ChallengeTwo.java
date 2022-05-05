package challenges;

import models.LLNode;
import models.LinkedList;
import java.util.HashSet;


public class ChallengeTwo {

    private LinkedList list;
    public ChallengeTwo(LinkedList list){
        this.list = list;
    }

    public LLNode findHead(){
        HashSet<LLNode> temp = new HashSet();
        LLNode node = list.gethead();
        for( int i = 0; i < list.getSize(); i++){
            if(temp.contains(node)) return node;
            else {
                temp.add(node);
                node = node.getNext();
            }
        }
        return null;
    }
}
