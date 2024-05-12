import java.util.Scanner;

public class Menu
{
    //a=0==>admin signin
    //a=1==>employee signin
    //a=2==>customer signin
    public int a=1;
    String qp;
    String wx;
    private int s;
    LinkedList employee1= new LinkedList();
    LinkedList customer1= new LinkedList();
    LinkedList2 item1= new LinkedList2();
    Admin admin=new Admin();
    Employee employee=new Employee();
    Customer customer=new Customer();
    Item item=new Item();
    Person admin1=new Admin("mohammad","1234","mhhz","mhhz1234");
    Scanner input=new Scanner(System.in);
    public void signin()
    {

        System.out.println("username:");
        System.out.println("password:");
         qp=input.next();
         wx=input.next();
        int c=employee1.search(qp,wx);
        int b=customer1.search(qp,wx);

        if(qp.equals(admin1.getUsername())||wx.equals(admin1.getPassword()))
            adminmenu();
        if(c==1)
        {
            employeemenu();

        }

        if(b==1)
        {

            customermenu();
        }

    }



    public void adminmenu()
   {
       while(1>0)
       {
           System.out.println("1.add employee");
           System.out.println("2.remove employee");
           System.out.println("3.update employee");
           System.out.println("4.show employees");
           System.out.println("5.logout");
           s=input.nextInt();
           if(s==1)
           {
               System.out.println("name:");String q=input.next();
               System.out.println("id:");String w=input.next();
               System.out.println("username:");String e=input.next();
               System.out.println("password:");String r=input.next();
               admin.ADD(q,w,e,r,employee1);
           }
           if(s==2)
           {
               System.out.println("enter id:");
               String t=input.next();
               employee1.searchidanddelet(t,employee1);
           }
           if(s==3)
           {

           }
           if(s==4)
           {
               employee1.print();
           }
           if(s==5)
           {
               signin();
               break;
           }

       }

   }
   public void employeemenu()
   {
       Person backupemployee=employee1.search(qp);
       while (1 > 0)
       {
           System.out.println("1.add customer");
           System.out.println("2.remove customer");
           System.out.println("3.update customer");
           System.out.println("4.show customers");
           System.out.println("5.add item");
           System.out.println("6.remove item");
           System.out.println("7.update item");
           System.out.println("8.show items");
           System.out.println("9.logout");
           s = input.nextInt();
           if (s == 1)
           {
               System.out.println("name:");
               String q = input.next();
               System.out.println("id:");
               String w = input.next();
               System.out.println("username:");
               String e = input.next();
               System.out.println("password:");
               String r = input.next();
               employee.ADD(q, w, e, r, customer1);
           }
           if (s == 2)
           {
               System.out.println("enter id:");
               String t = input.next();
               customer1.searchidanddelet(t, customer1);
           }
           if (s == 3)
           {

           }
           if (s == 4)
           {
               customer1.print();
           }
           if (s == 5)
           {
               System.out.println("name:");
               System.out.println("price:");
               String q = input.next();
               int w = input.nextInt();
               Item item2 = new Item(q, w);
               item1.add(item2, item1);
           }
           if (s == 6)
           {
               System.out.println("Enter name:");
               String q = input.next();
               item1.searchnameanddelet(q, item1);
           }
           if (s == 7)
           {

           }
           if (s == 8)
           {
               item1.print();
           }
           if(s==9)
           {
               signin();
               break;
           }
       }
   }
   private void customermenu()
   {
       while (1 > 0)
       {
           System.out.println("1.buyItems");
           System.out.println("2.my cart");
           System.out.println("3.logout");
           int s = input.nextInt();
           if (s == 1)
           {
               Customer backupcustomer= (Customer) customer1.search(qp);
               item1.print();
               String r =backupcustomer.name;
               String h="0";
               System.out.println("what do you want?");
               System.out.println("IF YOU ARE GIVE UP JUST ENTER 0");

               while (!r.equals(h))
               {
                   r = input.next();
                   if(r.equals(h))
                       break;
                   Item b = item1.search(r);
                   item1.add(b,backupcustomer.cart);
               }
           }
           if (s == 2)
           {
               Customer backupcustomer= (Customer) customer1.search(qp);
               backupcustomer.cart.printItem(backupcustomer.cart);
               backupcustomer.cart.bill(backupcustomer.cart);
           }
           if (s == 3)

           {
               signin();
               break;
           }
       }
   }
}
