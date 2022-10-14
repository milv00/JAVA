import java.util.Scanner;
public class ex08 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("정수 몇개 >> ");
        int chk=0;
        int n = in.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =(int)(Math.random()*100) + 1;
        }

        while(chk<n){
            System.out.print(arr[chk] + " ");
            chk++;
            if(chk % 10 == 0) System.out.println();
        }
    }

}
