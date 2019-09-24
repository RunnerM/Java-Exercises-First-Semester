public class Name
{
  String firstName;
  String lastName;

  public Name(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }
  public String getFormalName()
  {
    return lastName+", "+firstName;
  }
}
