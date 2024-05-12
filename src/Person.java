public abstract class Person
{
    protected String name;
    protected String id;
    protected String username;
    protected String password;

    public Person(String name, String id, String username, String password)
    {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Person()
    {

    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }


}
