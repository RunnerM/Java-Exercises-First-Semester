public class SongTest {
    public static void main(String[] args) {
        Song s1 = new Song("Something","Someone",new Time(0,3,23));
        System.out.println(s1.getArtist());
        System.out.println(s1.getLength());
        System.out.println(s1.getTitle());
        System.out.println(s1);
    }
}
