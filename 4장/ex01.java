class Tv{
    String name;
    int year;
    int size;

    public Tv(String name, int year, int size){
        this.name = name;
        this.year = year;
        this.size = size;
    }
    public void show(){
        System.out.println(name + "만든" + year + " ," + size);
    }

}
public class ex01 {
    public static void main(String[] args) {
        Tv myTv = new Tv("LG",2019,17);
        myTv.show();
    }
}