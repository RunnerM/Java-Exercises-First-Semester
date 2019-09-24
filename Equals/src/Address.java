import com.sun.jdi.request.ClassUnloadRequest;

import java.util.Objects;

public class Address
{
  private String town, street;
  private int number;
  private char letter;
  private int floor;
  private String door;

  public Address(String town, String street, int number, char letter, int floor,
                 String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
    this.door = door;
  }

  public Address(String town, String street, int number, char letter, int floor)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = floor;
    this.door="-";
  }

  public Address(String town, String street, int number, char letter)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.letter = letter;
    this.floor = Integer.MIN_VALUE;
    this.door="-";
  }

  public Address(String town, String street, int number, int floor, String door)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.floor = floor;
    this.door = door;
    this.letter= '-';
  }

  public Address(String town, String street, int number, int floor)
  {
    this.town = town;
    this.street = street;
    this.number = number;
    this.floor = floor;
    this.letter='-';
    this.door=null;
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

  public String getFullNumber()
  {
    return number + ", " + letter + ", " + floor + ", " + door;
  }

  public String toString()
  {
    return town + ", " + street + ", " + getFullNumber();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Address address = (Address) o;
    return getNumber() == address.getNumber() &&
            getLetter() == address.getLetter() &&
            getFloor() == address.getFloor() &&
            getTown().equals(address.getTown()) &&
            getStreet().equals(address.getStreet()) &&
            getDoor().equals(address.getDoor());
  }

}
