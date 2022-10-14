import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액 입력 >> ");
        int n = in.nextInt();

        for(int i=0; i<unit.length;i++){
            if(n/unit[i] != 0){
                System.out.println(unit[i] + " > " + n/unit[i]);
                n %= unit[i];
            }

        }
    }

}
