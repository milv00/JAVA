// 예외 처리
public class ex07 {
    public static void main(String[] args){
        int [] arr = new int[5];
        arr[0] = 0;
        
        try{
            for(int i=0;i<5;i++){
                arr[i+1] = i+1 + arr[i];   //i=4일때 예외 발생
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("예외 발생");
        }
    }
}
