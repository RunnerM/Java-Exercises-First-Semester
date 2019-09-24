import java.util.Scanner;

public class PersonTest
{
  public static void main(String[] args)
  {
    String name;
    int age;
    char gender;
    Scanner input = new Scanner(System.in);
    name = input.nextLine();
    age = Integer.parseInt(input.nextLine());
    gender= input.nextLine().charAt(0);
    Person p1 = new Person(name,age,gender);

    System.out.println(p1.getName()+", "+p1.getAge()+", "+p1.getGender());
    System.out.println(p1);
    p1.setName("BOB");
    System.out.println(p1);
    p1.setAge(12);
    System.out.println(p1);
    p1.setGender('M');
    System.out.println(p1.toString());





    input.close();
  }
}
