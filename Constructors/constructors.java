public class constructors {
    public String name1;
    public String name2;
    public constructors(String name1, String name2)
    {
        this.name1=name1;
        this.name2=name2;


    }
    public void display()
    {
        System.out.println("Before updating My first name is  " + this.name1);
        System.out.println("Before updating My last name is  " + this.name2);
    }

    public void setname(String settingname, String gavename)
    {
        this.name1= settingname;
        this.name2= gavename;
    }
    public String getname()
    {
        return this.name1 + "" + this.name2;


    }



    public void display1()
    {
        System.out.println("After updating My first name is  " + this.name1);
        System.out.println("After updating My last name is  " + this.name2);
    }

    public static void main(String[] args)
    {
        constructors c= new constructors("Harsha", "Reddy");
        c.display();
        c.setname("HarshNamliga", "Hash");
        c.getname();
        System.out.println("Value of getname is " + c.getname());

       c.display1();


    }
}
