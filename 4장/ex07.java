import java.util.Scanner;

class Day {
    private String work; //하루의 할 일을 나타내는 문자열
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work+"입니다.");
    }
}
public class ex07 {
    private Scanner in = new Scanner(System.in);
    private Day []days;
    ex07(int day){
        this.days = new Day[day];
        for(int i=0;i<days.length;i++){
            days[i] = new Day();
        }
    }
    private  void input(){
        System.out.print(" 날짜(1~30)? ");
        int day = in.nextInt();
        System.out.print("할일(빈칸없이입력)? ");
        String work = in.next();
        days[day-1].set(work);
    }
    private void view(){
        System.out.print(" 날짜(1~30)? ");
        int dayShow = in.nextInt();
        System.out.print(dayShow+"일의 할 일 >  ");
        days[dayShow-1].show();
    }
    private void finish(){
        System.out.print(" 프로그램을 종료합니다.");
    }
    private void run(){
        while (true){
            System.out.println("이번달 스케쥴 관리 프로그램");
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            int n = in.nextInt();
            switch (n){
                case 1 :
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    return;
                default:
                    System.out.println("잘못 입력 ");
            }
        }


    }
    public static void main(String[] args){
        ex07 april = new ex07(30); // 4월달의 할 일
        april.run();
    }

}
