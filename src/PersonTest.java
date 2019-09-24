import java.util.ArrayList;

public class PersonTest
{
  public static void main(String[] args)
  {

    ArrayList<Person> People = new ArrayList<>();
    for(int i=-3;i<70;i++){
      String name="Def";
      int age=i;
      char gender='d';
      Person newMan= new Person(name,age,gender);
      People.add(newMan);
    }
    for (Person man:People)
    {
      System.out.println(man.getAgeStatus());
    }






  }
}
