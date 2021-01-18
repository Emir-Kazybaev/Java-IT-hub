package OOP2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        TestAuthor();
        TestBook();
        TestBook2();
        TestMyPoint();
        myPointInit();
        TestCylinder();
        TestPoint();
        TestCircle();
        TestAnimal();
        TestMovablePoint();
        TestResizableCircle();
    }

    public static void TestAuthor(){
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("eamil is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }

    public static void TestBook(){
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        Book anotherBook = new Book("more Java", new Author("Paul Tan",
                "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }

    public static void TestBook2(){
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorNames());
    }

    public static void TestMyPoint(){
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
    }

    public static void myPointInit(){
        MyPoint[] myPoints = new MyPoint[10];
        for (int i = 0; i <10 ; i++ ){
            myPoints[i] = new MyPoint(i+1,i+1);
        }
        System.out.println(Arrays.toString(myPoints));
    }

    public static void TestCylinder(){
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
    }

    public static void TestPoint() {
        Point p1 = new Point(10, 20);
        System.out.println(p1);
        p1.setXY(100,10);
        System.out.println(p1);
    }

    public static void TestCircle(){
        Shape s1 = new Circle( "red", false,5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius()); // No getRadius method in shape class
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
//        Shape s2 = new Shape(); // Can't initialize Abstract class
        Shape s3 = new Rectangle("red", false,1.0, 2.0); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength()); // getLength method does not exist in shape class
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); // getSide method does not exist in shape class

        Rectangle r2 = (Rectangle)s4; // downcast
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

//        System.out.println(r2.getSide()); // This method belongs to an upper class (Square)
        System.out.println(r2.getLength());
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

    public static void TestAnimal(){
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();

//        Animal animal4 = new Animal(); // Initializing Abstract class is not allowed
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
//        Cat cat2 = (Cat)animal2; // Can't create Cat object from Dog instance
        System.out.println("SMTH");
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }

    public static void TestMovablePoint(){
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }

    public static void TestResizableCircle(){
        Circle c0 = new ResizableCircle(50.0);
        System.out.println(c0);
//        c0.resize(3); // Resize method doesn't exist in Circle
        ResizableCircle c1 = new ResizableCircle(200.0);
        System.out.println(c1);
        c1.resize(5);
        System.out.println(c1);
    }
}
