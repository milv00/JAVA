import  java.util.Scanner;
public class ex03 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("정수 입력 >> ");
        int n = in.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
