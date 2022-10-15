public class ex06 {
    public static void main(String[] args){
        int i = 1;
        while(i<100){
            int chk = 0;
            if(i/10 == 3 || i/10 == 6 || i/10 == 9) chk++;
            if(i%10 == 3 || i%10 == 6 || i%10 == 9) chk++;

            if(chk == 1) {
                System.out.println(i + "박수 짝");
            }
            if(chk == 2){
                System.out.println(i + "박수 짝짝");
            }
            i++;
        }
    }

}
