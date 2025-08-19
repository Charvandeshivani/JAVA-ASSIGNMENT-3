// inheritance-inherit/ access  properties of parent class to child class (extends - keyword )
// method overloading

class Parent
{
String surname = "Charvande";
int balance = 50000;
public void display()
{
System.out.println("Surname :"+surname+ " " +" balance :"+balance);
}

}
 class Child extends Parent
{
public static void main(String args[])
{
Child c = new Child();
c.display();
}
}