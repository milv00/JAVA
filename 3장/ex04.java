import  java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("소문자 알파벳 입력 >> ");

       String s = in.next();
       char c = s.charAt(0);

       // < 인지 <= 인지 주의하자
       for(int i=0;i<=c-'a';i++){
           for(int j='a';j<=c-i;j++){
               System.out.print((char)j);
           }
           System.out.println();
       }
    }

}
