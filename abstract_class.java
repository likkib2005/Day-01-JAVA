abstract class sahpe
{
abstract double area();
}
class triangle extends shape
{
int x,y,z;
triangle(int a,int b)
{
x=a;
y=b;
}
double area()
{
return (x*y)/2;
}
}
class rectangle extends shape
{
int x,y;
rectangle(int a,int b)
{
x=a;
y=b;
}
double area()
{
return (x*y);
}
}
class main
{
public static void main(String args[])
{
triangle t=new triangle(2,4);
rectangle r=new rectangle(2,4);
System.out.println("area of triangle="+t.area());
System.out.println("area of rectangle="+r.area());
}
}
