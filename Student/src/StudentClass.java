import java.sql.Struct;

public class StudentClass {
    public static void main(String[] args) {
        Student s1= new Student("Bill","HU",121333);
        Student s2= new Student("Noname Bill","CH",745483);
        Student s3= new Student("Bob",123442);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }
}
