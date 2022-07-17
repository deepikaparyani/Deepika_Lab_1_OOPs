class Main {
	public static void main(String args[]) {
		// Your code goes here
        Rectangle r = new Rectangle(5,2);
        Square sq = new Square(5);
        Render rd = new Render();
        r.draw_shape("Thanks for choosing Render");
        r.draw_shape();
        r.draw_shape("Thanks for choosing Rectangle");
        sq.draw_shape();
        sq.draw_shape("Thanks for choosing Square");
	}
}
interface IShape{

    public double calculate_area();
    public double calculate_perimeter();
    public void draw_shape();
    public void draw_shape(String Msg);

}
class Render implements IShape{
    public double calculate_area(){
        return 0;
    }
    public double calculate_perimeter(){
        return 0;
    }
    public void draw_shape(){
        System.out.println("This is a Render Shape with " +" " +calculate_area()+ " "+ calculate_perimeter());
    }
    public void draw_shape(String Msg){
        System.out.println("This is a Render Shape with Msg " + Msg);
    }    
}
class Circle implements IShape{
    double radius;
    final double pie = 3.14; 
    public Circle(double radius){
        this.radius= radius;
    }
    public double calculate_area(){
        return (this.pie*this.radius*this.radius);
    }
    public double calculate_perimeter(){
        return (this.radius);
    }
    public void draw_shape(){
        System.out.println("This is a Circle Shape with " +calculate_area()+ " "+ calculate_perimeter());
    }
    public void draw_shape(String Msg){
        System.out.println("This is a Circle Shape with Msg " + Msg);
    }
    
}
class Triangle implements IShape{
    double b,h,l;
    public Triangle(double b , double h ,double l){
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
        System.out.println("This is a Triangle Shape with " +calculate_area()+ " "+ calculate_perimeter());
    }
    public void draw_shape(String Msg){
        System.out.println("This is a Triangle Shape with Msg " + Msg);
    }
}
class Rectangle implements IShape{
double w,l;
    public Rectangle(double w, double l){
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
        System.out.println("This is a Rectangle Shape with " +" " +calculate_area()+ " "+ calculate_perimeter());
    }
    public void draw_shape(String Msg){
        System.out.println("This is a Rectangle Shape with Msg " + Msg);
    }    
}

class Square extends Rectangle{
    double sides;
    public Square(double sides){
        super(sides,sides);
        this.sides = sides;
    }
    public double calculate_area(){
        return (this.sides*this.sides);
    }
    public double calculate_perimeter(){
        return (this.sides*4);
    }
    public void draw_shape(){
        System.out.println("This is a Square Shape with "+" " +calculate_area()+ " "+ calculate_perimeter());
    }
}
