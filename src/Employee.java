public class Employee extends Person
{

    private int i=0,y=0;
    Item item[]=new Item[20];
    public Employee(String name, String id, String username, String password)
    {
        super(name,id,username,password);
    }

    public Employee()
    {
    }


    public void ADD(String name, String id, String username, String password,LinkedList s)
    {
        Customer adm=new Customer(name,id,username,password);
        s.add(adm,s);
    }

    public void creat(String name,int price,LinkedList s)
    {
        Item kala=new Item(name, price);
        //s.add();
    }
}
