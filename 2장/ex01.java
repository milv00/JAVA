import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("₩ 입력 >> ");
        int n = in.nextInt();
        System.out.println(n + "> $" + n*1.1);
    }
}
