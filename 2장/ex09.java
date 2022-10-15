import java.util.Scanner;
public class ex09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("중심, 반지름 입력 >> ");
        int x = in.nextInt();
        int y = in.nextInt();
        double r = in.nextDouble();
        System.out.print("점 입력 >> ");
        int a  = in.nextInt();
        int b =  in.nextInt();

        double r1 = (double) ((a-x)*(a-x) + (b-y)*(b-y));
        double r2 = r*r;
        if(r1 < r2) System.out.println("안에 있음");
        else System.out.println("밖에 있음");
    }


}
