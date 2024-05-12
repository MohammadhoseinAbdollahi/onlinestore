public class Admin extends Person
{


    private int i=0;
    public Admin(String name, String id, String username, String password)
    {
        super(name, id, username, password);
    }

    public Admin()
    {
    }

   public void ADD(String name, String id, String username, String password,LinkedList s)
    {
        Employee adm=new Employee(
                name,id,username,password);
        s.add(adm,s);
    }
}
