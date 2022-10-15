import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수 3개 입력 >> ");
        int arr[] = new int[3];
        int tmp;
        for(int i=0;i<3;i++){
            arr[i] = in.nextInt();
        }
        // 내림차순 꼭 외우자
        for(int i=0;i<3;i++){
            for(int j=0;j<(3-1)-i;j++){
                if(arr[j] < arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}