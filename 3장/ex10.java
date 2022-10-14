public class ex10 {
    public static void main(String[] args){

        int [][]arr = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               arr[i][j] = 0;
            }
        }
        int chk = 0;
        while(chk <10){
            int a = (int)(Math.random()*4);
            int b = (int)(Math.random()*4);

            if(arr[a][b] != 0) continue;

            else{
                arr[a][b] = (int)(Math.random()*9) + 1;
                chk++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
