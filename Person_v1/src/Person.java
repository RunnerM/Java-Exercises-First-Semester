public class Person
{
  private String name;
  private int age;
  private char gender;

  public Person(String name, int age, char gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person(String name, char gender)
  {
    this.name = name;
    this.gender = gender;
  }

  public Person(char gender)
  {
    this.gender = gender;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public char getGender()
  {
    return gender;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  @Override public String toString()
  {
    return "Person{" + "name='" + name + '\'' + ", gae=" + age + ", gender="
        + gender + '}';
  }
}
