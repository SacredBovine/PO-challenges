package models;

public class LinkedList<Node>  {

    private LLNode head;
    private LLNode tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void append(LLNode node){
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public LLNode gethead(){
        return head;
    }

    public int getSize(){
        return size;
    }
    public boolean hasNext(LLNode node){
        return (node.getNext() != null);
    }

    @Override
    public String toString() {
        boolean complete = false;
        StringBuilder ret = new StringBuilder();
        LLNode node = head;
        int cur = 0;
        ret.append('[');

        while(!complete) {
            ret.append(node.toString());
            if(cur < size) ret.append(',');
        }
        ret.append(']');
        return ret.toString();
    }

}