import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("x,y 좌표 입력 >> ");
        int x = in.nextInt();
        int y = in.nextInt();

        if(100<x && x<200 && 100<y && y<200){
            System.out.println("사각형 안에 있음");
        }
        else    System.out.println("error");



    }

}
