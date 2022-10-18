import java.util.Scanner;

 class Circle1 {
    private double x, y;
    private int radius;
    public Circle1(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println(x+" "+y+" "+radius);
    }
    public int getRadius(){
        return radius;
    }
}

public class ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle1 c[] = new Circle1[3]; // 3개의 Circle 배열 선언
        for(int i=0; i < c.length; i ++) {
            System.out.print("x, y, radius >>");
            double x = in.nextDouble(); // x값 읽기.
            double y = in.nextDouble(); // y값 읽기.
            int r = in.nextInt(); // radius값 읽기.
            c[i] = new Circle1(x,y,r); // Circle 객체 생성
        }
        for(int i=0; i<c.length; i++)
            c[i].show(); // 모든 Circle 객체 출력

        int max = c[0].getRadius();
        int maxi = 0;
        for(int i=1;i<3;i++){
            if(max < c[i].getRadius()){
                max = c[i].getRadius();
                maxi = i;
            }
        }
        System.out.print("가장 큰 면적  >> ");
        c[maxi].show();

        in.close();
    }

}