

public class LinkedList {
    private Node first;
    LinkedList(){
        first = null;
    }
    public void searchidanddelet(String n,LinkedList i) {

        if (first == null) {
            System.out.println("NOT FOUND");
        } else {
            Node p = first;
            while (p != null) {
                if (n.equals(p.getS().getUsername()) ) {
                    remove(p.getS());
                }

                p = p.getNext();
            }

        }
    }
    public int search(String a,String b)
    {
        if (first == null) {
            return -1;
        } else {
            Node p = first;
            while (p != null) {
                if (a.equals(p.getS().getUsername())&&b.equals(p.getS().getPassword()) ) {
                    return 1;
                }

                p = p.getNext();
            }

        }
        return 0;
    }
    public Person search(String a)
    {
        if (first == null) {

        } else {
            Node p = first;
            while (p != null) {
                if (a.equals(p.getS().getUsername()) ) {
                    return p.getS();
                }

                p = p.getNext();
            }

        }
        return null;
    }
    public void add(Person s,LinkedList i){
        Node n = new Node(s,null);
        if(first == null){
            first=n;
        }else{
            Node p = first;
            while(p.getNext()!=null){
                p=p.getNext();
            }
            p.setNext(n);
        }
    }

    public void remove(Person s){
        Node p = first, q=null;
        while(p!=null){
            if(p.getS().equals(s)){
                if(p==first){
                    first=first.getNext();
                }else{
                    q.setNext(p.getNext());
                    p=p.getNext();
                    continue;
                }
            }
            q=p;
            p=p.getNext();
        }
    }

    public void print(){
        Node n=first;
        while(n!=null){
            System.out.print("name:"+n.getS().name+"\n"
                    +"id:"+n.getS().id+"\n"
                    +"username:"+n.getS().username+"\n"+
                    "password:"+n.getS().password+"\n"+
                    "---------------------------------"+"\n");
            n=n.getNext();
        }
    }
}
