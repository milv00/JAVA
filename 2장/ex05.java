import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수 3개 입력 >> ");
        int []arr = new int[3];
        int tmp;
        for(int i=0;i<3;i++){
            arr[i] = in.nextInt();
        }
        //오름 차순 (갈수록 커짐)
        for(int i=0;i<3;i++){
            for(int j=0;j<(3-1)-i;j++){
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        if(arr[0] + arr[1] > arr[2]){
            System.out.println("삼각형임");
        }
        else System.out.println("error");
    }
}