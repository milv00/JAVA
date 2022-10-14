import java.util.Scanner;

public class ex16{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str[]= {"가위","바위","보"};

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        System.out.print("가위 바위 보!>> ");
        String op=in.next();
        while(!op.equals("그만")) {
            int n=(int)(Math.random()*3);
            System.out.print("사용자 = "+op+" , 컴퓨터 = "+str[n]+" , ");
            if(n==0){
                switch(op) {
                    case "가위":
                        System.out.println("비겼습니다.");
                        break;
                    case "바위":
                        System.out.println("사용자가 이겼습니다.");
                        break;
                    case "보":
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    default:
                        break;
                }
            }
            else if(n==1) {
                switch(op) {
                    case "가위":
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    case "바위":
                        System.out.println("비겼습니다.");
                        break;
                    case "보":
                        System.out.println("사용자가 이겼습니다.");
                        break;
                    default:
                        break;
                }
            }
            else {
                switch(op) {
                    case "가위":
                        System.out.println("사용자가 이겼습니다.");
                        break;
                    case "바위":
                        System.out.println("컴퓨터가 이겼습니다.");
                        break;
                    case "보":
                        System.out.println("비겼습니다.");
                        break;
                    default:
                        break;
                }
            }
            System.out.print("가위 바위 보!>>");
            op = in.next();
        }
        in.close();
    }
}
