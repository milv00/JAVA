class Circle2{
    int radius;

    public Circle2(int i){
        this.radius = i+1;
    };
    public double getArea(){
        return 3.14  * radius * radius;
    }
}
public class ex05 {
    public static void main(String[] args) {
        Circle2 [] c = new Circle2[5];
        for(int i=0;i<c.length;i++){
            c[i] = new Circle2(i);
        }

        for(int i=0;i<c.length;i++){
            System.out.print((int)c[i].getArea() + " ");
        }
    }
}