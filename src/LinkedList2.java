public class LinkedList2
{
    private Node2 first;
    LinkedList2(){
        first = null;
    }
    public void searchnameanddelet(String n,LinkedList2 i) {

        if (first == null) {
            System.out.println("NOT FOUND");
        } else {
            Node2 p = first;
            while (p != null) {
                if (n.equals(p.getS().getName()) ) {
                    remove(p.getS());
                }

                p = p.getNext();
            }

        }
    }

    public Item search(String a)
    {
        if (first == null) {
            System.out.println("NOT FOUND");
            return null;
        } else {
            Node2 p = first;
            while (p != null) {
                if (a.equals(p.getS().getName() )) {
                    return p.getS();
                }

                p = p.getNext();
            }

        }
        System.out.println("NOT FOUND");
        return null;
    }

    public void add(Item s,LinkedList2 i){
        Node2 n = new Node2(s,null);
        if(i.first == null){
            i.first=n;
        }else{
            Node2 p = i.first;
            while(p.getNext()!=null){
                p=p.getNext();
            }
            p.setNext(n);
        }
    }

    public void remove(Item s){
        Node2 p = first, q=null;
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
        Node2 n=first;
        while(n!=null){
            System.out.print("name:"+n.getS().getName()+"\n"
                    +"price:"+n.getS().getPrice()+"\n"+
                    "---------------------------------"+"\n");
            n=n.getNext();
        }
    }
    public void printItem(LinkedList2 Y){
        Node2 n=Y.first;
        while(n!=null){
            System.out.print("name:"+n.getS().getName()+"\n"
                    +"price:"+n.getS().getPrice()+"\n"+
                    "---------------------------------"+"\n");
            n=n.getNext();
        }
    }
    public  void bill(LinkedList2 y)
    {
        int v=0;
        Node2 n=y.first;
        while(n!=null){
            v=v+n.getS().getPrice();
            n=n.getNext();
        }
        System.out.println("total price:"+v);
    }
}

