package models;

public class LLNode<T> {
    private T value;
    private LLNode next = null;

    public LLNode(T value){
        this.value = value;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    public LLNode getNext(){
        return next;
    }

    public boolean hasNext(){
        return (next != null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LLNode<?> llNode = (LLNode<?>) o;

        if (value != null ? !value.equals(llNode.value) : llNode.value != null) return false;
        return getNext() != null ? getNext().equals(llNode.getNext()) : llNode.getNext() == null;
    }

    @Override
    public String toString() {
        return "LLNode{" +
                "value=" + value +
                '}';
    }
}
