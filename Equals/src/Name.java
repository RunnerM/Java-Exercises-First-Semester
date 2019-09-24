import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Name name = (Name) o;
    return getFirstName().equals(name.getFirstName()) &&
            getLastName().equals(name.getLastName());
  }

}
