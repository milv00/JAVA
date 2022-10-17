class Book{
    String name;
    String author;
    void show(){
        System.out.println(name + " " + author);
    }
    public Book(){
        this.name = "default";
        this.author = "default";
        System.out.println("생성자 호출");

    }
    public Book(String n){
        this.name = n;
        this.author = "default";
    }
    public Book(String n, String a){
        this.name = n;
        this.author = a;
    }
}
public class ex04 {
    public static void main(String[] args){

        Book b1 = new Book("abc", "cba");
        Book b2 = new Book("def");
        Book b3 = new Book();
        b2.show();
        b1.show();

    }
}
