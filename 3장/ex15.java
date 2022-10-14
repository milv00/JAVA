import java.util.InputMismatchException;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("곱하고자 하는 두수 입력 >> ");
            try{
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a + "x" + b + " = " + a*b);
                break;
            }catch (InputMismatchException e){
                System.out.println("실수는 입력하면 안됨");
                in.nextLine();        // catch에서 Scanner에 입력된 키 제거 위해 씀
                continue;
            }
        }
        in.close();
    }
}
