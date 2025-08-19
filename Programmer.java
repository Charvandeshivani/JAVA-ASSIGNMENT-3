class Employee1
{
int salary =65000;
void show()
{
System.out.println("Employee class");
}
}
public class Programmer extends Employee1
{
int bonus = 20000;
void display()
{
System.out.println("Programmer class");
}
public static void main(String[] args)
{
Programmer p = new Programmer();

 int total =p.salary + p.bonus;
p.show();
p.display();
System.out.println("employee total salary is :"+total);
}
}



