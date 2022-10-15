import java.util.Scanner;

public class ex08 {
    public  static boolean inRect(int x, int y, int x1, int y1, int x2, int y2){
        if((x >= x1 && x  < x2) && (y >= y1 && y  < y2))
            return  true;
        else return false;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("x1,y1 좌표 입력 >> ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.print("x2,y2 좌표 입력 >> ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        boolean answer1 = inRect(x1,y1,100,100,200,200);
        boolean answer2 = inRect(x2,y2,100,100,200,200);

        if(answer1 == true && answer2 == true)
            System.out.println("충돌 안함");
        else System.out.println("충돌함");




    }
}
