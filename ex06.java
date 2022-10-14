// 배열 리턴
public class ex06 {
    static int[] makeArray(){           // 왜 static 인지
        int tmp[] = new int[4];
        for(int i=0;i<tmp.length;i++){
            tmp[i] = i;
        }
        return tmp;
    }

    public static void main(String[] args){
        int arr[];
        arr = makeArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
