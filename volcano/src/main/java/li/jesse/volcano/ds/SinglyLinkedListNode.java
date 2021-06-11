package li.jesse.volcano.ds;

public class SinglyLinkedListNode {

    private Integer value;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(Integer value, SinglyLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }
}
