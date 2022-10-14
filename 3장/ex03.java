public class ex03 {
    enum Week {월, 화, 수, 목, 금, 토, 일};

    public static void  main(String[] args ){

        int []n = {1,2,3,4,5};
        String []names = {"aa","bb","cc","dd","ee","ff"};

        int sum = 0;

        for(int k : n){
            sum += k;
        }
        System.out.println(sum);

        for(String s : names){
            System.out.print(s + ' ');
        }
        System.out.println();

        for(Week day : Week.values()){
            System.out.print(day + "요일 ");
        }
    }
}
