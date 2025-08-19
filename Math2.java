class Math2
{
 public int sum (int a,int b, int c )
{
 return a +b+c;
}
 public int sum(int a,int b )
{
return a+b;
}
public static void  main(String[] args)
{
Math2 m = new Math2();
int i = m.sum(12,30,02);
int j = m.sum(20,30);
System.out.println("sum is :" +i);
System.out.println("SUm is :"+j);
}
}