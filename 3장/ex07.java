public class ex07 {
    public static void main(String[] args){
        int arr[] = new int[10];
        int i;
        int sum = 0;
        System.out.print("랜덤한 정수들 > ");

        for(i=0;i<10;i++){
            arr[i] = (int)(Math.random()*10) + 1;       //math.random() 0부터 1사이 난수 *10 필수!
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.print("평균 > " + (double)sum/10);

    }

}
