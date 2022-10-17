public class ex06 {
    static void replaceSpace(char a[]){
        for(int i=0;i<a.length;i++)
            if(a[i] == ' ')
                a[i] = ',';
    }

    static void printArr(char a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        char c[] = {'t','t','a','d', ' ','a',' ','h'};
        printArr(c);
        replaceSpace(c);
        printArr(c);
    }
}
