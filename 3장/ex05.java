import  java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("양의 정수 10개 입력 >> ");
        for(int i=0;i<10;i++){
            arr[i] = in.nextInt();
        }
        System.out.print("3의 배수 > ");
        for(int i=0;i<10;i++){
            if(arr[i] % 3 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}