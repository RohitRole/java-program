class constructor1
{
String name; //Instance variable.
constructor1(){// Constructor
name = "Rohini";
}
}
class demo1
{
public static void main(String[] args)
{
constructor1 c = new constructor1();// object created
System.out.println(c.name);
}
}