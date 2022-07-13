
class Shape{
    String color,type;
    public Shape(String color,String type){
        this.color = color;
        this.type = type;
    }
    public double calculate_area(){
        return 0;
    }
    public double calculate_perimeter(){
        return 0;
    }
    public void draw_shape(){
        System.out.println("This is a "+ type +"Shape with " + color);
    }

}
class Triangle extends Shape{
    double b,h,l;
    public Triangle(double b , double h ,double l, String color , String tye){
        super(color,tye);
        this.b= b;
        this.h=h;
        this.l=l;
    }
    
    public double calculate_area(){
        return ((this.b*this.h)/2);
    }
    public double calculate_perimeter(){
        return (this.b+this.h+this.l);
    }
    public void draw_shape(){
        System.out.println("This is a "+ super.type+ " Shape with " + super.color +" " +calculate_area()+ " "+ calculate_perimeter());
    }
}
class Rectangle extends Shape{
double w,l;
    public Rectangle(double w, double l, String color , String tye){
        super(color,tye);
        this.w= w;
        this.l=l;
    }
    
    public double calculate_area(){
        return (this.l*this.w);
    }
    public double calculate_perimeter(){
        return 2*(this.l+this.w);
    }
    public void draw_shape(){
        System.out.println("This is a "+ super.type+ " Shape with " + super.color +" " +calculate_area()+ " "+ calculate_perimeter());
    }    
}

class Square extends Triangle{
    double sides;
    public Square(double sides,String color , String type){
        super(sides,sides,sides,color,type);
        this.sides = sides;
    }
    public double calculate_area(){
        return (this.sides*this.sides);
    }
    public double calculate_perimeter(){
        return (this.sides*4);
    }
    public void draw_shape(){
        System.out.println("This is a "+ super.type+ " Shape with " + super.color +" " +calculate_area()+ " "+ calculate_perimeter());
    }
}
class Circle extends Shape{
    double radius;
    final double pie = 3.14; 
    public Circle(double radius, String color , String type){
        super(color,type);
        this.radius= radius;
    }
    public double calculate_area(){
        return (this.pie*this.radius*this.radius);
    }
    public double calculate_perimeter(){
        return (this.radius);
    }
    public void draw_shape(){
        System.out.println("This is a "+ super.type+ " Shape with " + super.color +" " +calculate_area()+ " "+ calculate_perimeter());
    }
    
}

public class MyClass {
    public static void main(String[] args) {
        Shape s= new Shape("Red","NA");
        Triangle t= new Triangle(5,6,3,"Orange","Triangle");
        t.draw_shape();
        Rectangle r= new Rectangle(5,6,"Green","Rectangle");
        r.draw_shape();
        Circle c= new Circle(5,"Pink","Circle");
        c.draw_shape();
        Square sh= new Square(5,"Blue","Square");
        sh.draw_shape();
    }
}

