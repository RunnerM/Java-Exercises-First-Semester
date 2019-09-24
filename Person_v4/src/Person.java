public class Person
{
  private Name name;
  private int age;
  private char gender;


  public Person(Name name, int age, char gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person(Name name, char gender)
  {
    this.name = name;
    this.gender = gender;
  }

  public Person(char gender)
  {
    this.gender = gender;
  }

  public Name getName()
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

  public void setName(Name name)
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

  public String getAgeStatus()
  {
    if (age < 0)
    {
      return "Error";
    }
    else if (age >= 0 && age <= 12)
    {
      return "Child";
    }
    else if (age > 12 && age <= 19)
    {
      return "Teenager";
    }
    else if (age > 19 && age <= 65)
    {
      return "Adult";
    }
    else
    {
      return "Senior citizen";
    }
  }
}
