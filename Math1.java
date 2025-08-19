class Math1
{

public int sum2(int a , int b )
{
return  a+b;
}
 public double sum2( double  a, double  b)
{
return  a+b;
}
public static void main(String[] args)
{
Math1 m = new Math1();
 int i = m.sum2(12,6);
System.out.println("sum is :"+i);
 double  j = m.sum2(3.5,5.0);
System.out.println("sum is :"+j);

}
}