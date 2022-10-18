import java.util.Scanner;
class Grade{
    int math,science,english;
    public Grade(int math, int science, int english){
       this.math = math;
       this.science = science;
       this.english = english;
    }

    public int Avg(){
        int sum = (int)(math+science+english)/3;
        return sum;
    }
}

public class ex02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("3개 점수 입력  >> ");
        int math = in.nextInt();
        int science = in.nextInt();
        int english = in.nextInt();

        Grade me = new Grade(math,science,english);
        System.out.println(me.Avg());

    }
}
