

public class Node {
    private Person s;
    private Node next;

    public Node(Person s, Node next)
    {
        this.s = s;
        this.next = next;
    }

    public Person getS()
    {
        return s;
    }

    public void setS(Employee s)
    {
        this.s = s;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }



}
