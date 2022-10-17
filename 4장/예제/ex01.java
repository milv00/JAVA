class Circle{
    int radius;
    String name;
    public Circle(){};
    public double getArea(){
        return 3.14  * radius * radius;
    }
}

public class ex01 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1 = new Circle();
        c.radius = 10;
        c.name = "pizza";

        c1.radius = 12;
        c1.name = "Donut";
        System.out.println(c.name + " 면적 > " + c.getArea());
        System.out.println(c1.name + " 면적 > " + c1.getArea());
    }
}