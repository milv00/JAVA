import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("금액 입력 >> ");
        int money = in.nextInt();
        int arr[]  = {50000, 10000, 1000, 100, 50, 10, 1};
        int i = 0;
        while(i<7){

            if(money/arr[i] != 0){
                System.out.println(arr[i] + " > " + money/arr[i]);
                money %= arr[i];
                i++;
            }
        }
    }

}
