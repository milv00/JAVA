public class ex01 {
    public static void main(String[] args){

        int a = 1;
        int b = 1;

        System.out.println(a++);    // 1
        System.out.println(++b);    // 2

        int d = 3;
        a = d++;    // a = 3, d = 4
        a = ++d;    // a = 5, d = 5
        a = d--;    // a = 5, d = 4
        a = --d;    // a = 3, d = 3

    }

}
