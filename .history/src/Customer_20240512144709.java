

public class Customer extends Person
{

    protected   LinkedList2 cart=new LinkedList2();
    private int i=0;

    public Customer(String name, String id, String username, String password)
    {
        super(name,id,username,password);
    }

    public Customer()
    {
    }


}
