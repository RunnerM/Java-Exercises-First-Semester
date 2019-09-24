public class Address
{
  String town,street,door;
  int number,floor;
  char letter;

  public Address(String town, String street, String door, int number, int floor,
      char letter)
  {
    this.town = town;
    this.street = street;
    this.door = door;
    this.number = number;
    this.floor = floor;
    this.letter = letter;
  }

  public String getTown()
  {
    return town;
  }

  public String getStreet()
  {
    return street;
  }

  public String getDoor()
  {
    return door;
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    return floor;
  }

  public char getLetter()
  {
    return letter;
  }
  public  String getFullNumber(){
    return number+", "+letter+", "+floor+", "+door;
  }
  public String toString(){
    return town+", "+street+", "+getFullNumber();
  }
}
