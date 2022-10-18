import javax.swing.*;
import java.util.Scanner;

class PhoneBook{
    String name,tel;

    public void set(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getNum(){
        return tel;
    }

    public String getName(){
        return name;
    }
    public void show(){
        System.out.println(name + ", " + tel);
    }

}
public class ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("인원수 >> ");
        int n = in.nextInt();
        PhoneBook []p = new PhoneBook[n];

        for(int i=0;i<n;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            p[i] = new PhoneBook();
            String name = in.next();
            String tel = in.next();
            p[i].set(name,tel);
        }
        System.out.print("저장되었습니다...");
        for(int i=0;i<n;i++){
            p[i].show();
        }
        int i = 0;
        while(true){
            System.out.print("검색할 이름 >> ");
            String name = in.next();
            for( i=0;i<p.length;i++){
                if(name.equals(p[i].getName())){
                    System.out.println(name +"의 번호는 "+p[i].getNum());
                    i--;
                    break;
                }
            }

            if(name.equals("exit")) break;
            if(i == n) System.out.println("없음");

        }

    }
}
//        인원수 >> 3
//        이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>황기태 777-7777
//        이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>나명품 999-9999
//        저장되었습니다...
//        검색할 이름 >>황기순
//        황기순이 없습니다.
//        검색할 이름 >>최자바
//        최자바의 번호는 333-1234 입니다.
//        검색할 이름 >>그만