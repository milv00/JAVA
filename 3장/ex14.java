import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};

        while(true){
            int chk = 0;                        // 조건 걸어야 할 때 0,1로 나누는 센스
            System.out.print("과목 이름 >> ");
            String name = in.next();

            if(name.equals("그만")) break;


            for(int i=0;i< course.length;i++){
                if(course[i].equals(name)){
                    System.out.println(name + " 점수 > " + score[i]);
                    chk = 1;
                }
            }
            if(chk == 0){                       //조건을 Chk로 파악
                System.out.println("없음");
                continue;
            }
        }


    }

}
