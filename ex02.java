import java.util.Scanner;
// 배열의 length 사용해 배열크기만큼 정수 입력받고 평균 구하기
public class ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println(arr.length + "개 정수 입력 >> ");
        for(int i=0;i<5;i++){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
        System.out.println("Average >> " + avg);

    }

}
