class Circle1{
    int radius;
    String name;

    public Circle1(){
        radius = 1;
        name =  "basic";
    }
    public Circle1(int r, String n){
       this.radius = r;
       this.name = n;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}
public class ex03 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(10,"Pizza");
        Circle1 c2 = new Circle1();
        System.out.println(c1.name +" "+ c1.radius +" "+ c1.getArea());
        System.out.println(c2.name +" "+ c2.radius + " " +c2.getArea());

        c2.name = "Donut";
        System.out.println(c2.name +" "+ c2.radius + " " +c2.getArea());







    }
}