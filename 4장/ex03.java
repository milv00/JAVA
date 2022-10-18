import java.util.Scanner;
class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song() {
        this("a","b",0,"c");
    };
    public Song(String title,  String artist, int year, String country){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    public void show(){
        System.out.println(title + artist + year + country);
    }
}
public class ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String t = in.next();
        String a = in.next();
        int y = in.nextInt();
        String c = in.next();

        Song s = new Song(t,a,y,c);
        Song s1 = new Song();
        s.show();
        s1.show();
    }

}
