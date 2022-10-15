import java.util.Scanner;
public class ex10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("중심, 반지름 입력 >> ");
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        System.out.print("중심, 반지름 입력 >> ");
        int a = in.nextInt();
        int b = in.nextInt();
        int r1 = in.nextInt();

        int tmp1 =  ((a-x)*(a-x) + (b-y)*(b-y));
        int tmp2 = (r1+r) *(r1+r);
        if(tmp1 < tmp2) System.out.println("겹침");
        else System.out.println("안겹침");
    }


}
