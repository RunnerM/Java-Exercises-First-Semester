public class ColourTest {
    public static void main(String[] args) {
        Colour c1 = new Colour("#B74E38");
        Colour c2 = new Colour(12,23,34);

        System.out.println(c1.getRed()+" "+c1.getGreen()+" "+c1.getBlue());
        System.out.println(c1.toHex(c1.getRed(),c1.getGreen(),c1.getBlue()));
    }
}
