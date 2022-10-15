import java.util.Scanner;
public class ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("정수 입력 (두자리) >> ");
        int n = in.nextInt();

        int a = n/10;
        int b = n%10;

        if(a==b) System.out.println("각 자리 같음");
        else System.out.println("다름");
    }

}
