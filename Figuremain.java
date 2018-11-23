abstract class Figure
{
int dim1=5;
abstract void findArea();
abstract void findPerimeter();
}
class Circle extends Figure
{//Area of Circle
void findArea()
{
float Carea=3.14F*dim1*dim1;
System.out.println("Area of Circle:"+Carea);
}//Perimeter of Circle
void findPerimeter()
{
float Cperimeter=2*3.14f*dim1;
System.out.println("perimeter of Circle:"+Cperimeter);
}
}
class Rectangle extends Figure
{//Area of Rectangle
void findArea()
{
int Rarea=dim1*dim1;
System.out.println("area of rectangle:"+Rarea);
}//Perimeter of Rectangle
void findPerimeter() 
{
int Rperimeter=2*(dim1+dim1);
System.out.println("perimeter of Rectangle:"+Rperimeter);
}
}
class Triangle extends Figure
{//Area of Triangle
void findArea()
{
float Tarea=0.5f*dim1*dim1;
System.out.println("area of Triangle:"+Tarea);
}//Perimeter of Triangle
void findPerimeter()
{
int Tperimeter=3*dim1;
System.out.println("Perimeter of Triangle:"+Tperimeter);
}
}
class Figuremain
{
public static void main(String[] args)
{
Circle c=new Circle();
c.findArea();
c.findPerimeter();
Rectangle r=new Rectangle();
r.findArea();
r.findPerimeter();
Triangle t=new Triangle();
t.findArea();
t.findPerimeter();
}
}
