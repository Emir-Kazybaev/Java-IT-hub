package OOP2;

public class Circle extends Shape implements GeometricObject{
    protected double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getCircumference(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
