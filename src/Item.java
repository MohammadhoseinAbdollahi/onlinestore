public class Item
{
    private String name;
    private int price;
    private  int number;
    public Item(String name)
    {
        this.name = name;
    }
    public Item(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    public  Item()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
