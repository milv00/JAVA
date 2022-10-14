import java.util.Scanner;
// 양수 5개 입력받아 배열에 저장하고 제일 큰 수 출력
public class ex01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int array[] = new int[5];

        System.out.println("양수 5개 입력 >> ");

        for(int i=0;i<5;i++){
            array[i] = in.nextInt();
        }
        int max = array[0];
        for(int i=1;i<5;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("MAX = " + max);

    }
}
