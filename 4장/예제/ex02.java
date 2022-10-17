class Rect{
    int width;
    int height;
    public Rect(){};

    public int getArea(){
        return width * height;
    }
}
public class ex02 {
    public static void main(String[] args) {
        Rect r = new Rect();

        r.width = 10;
        r.height = 3;
        System.out.println("면적 > "+ r.getArea());

    }
}