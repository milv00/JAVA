// 점수,학년 입력받아 60점 이상이면 합격 아니면 불합,, 4학년인 경우 70점 이상이어야 합격
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("점수, 학년 입력 >> ");
        int score = in.nextInt();
        int grade = in.nextInt();

        if(score >= 60){
            if(grade != 4){
                System.out.println("합격");
            }
            if(score >= 70) {
                System.out.println("합격");
            }
        }
        else System.out.println("불합");


    }

}
