import java.util.Scanner;

public class AddressTest
{
  public static void main(String[] args)
  {
    String town,street,door;
    int number,floor;
    char letter;

    Scanner input = new Scanner(System.in);
    town=input.nextLine();
    street=input.nextLine();
    number = Integer.parseInt(input.nextLine());
    letter= input.nextLine().charAt(0);
    floor=Integer.parseInt(input.nextLine());
    door= input.nextLine();
    Address newAdress= new Address(town,street,door,number,floor,letter);
    System.out.println(newAdress.getDoor());
    System.out.println(newAdress.getFloor());
    System.out.println(newAdress.getLetter());
    System.out.println(newAdress.getStreet());
    System.out.println(newAdress.getTown());
    System.out.println(newAdress.getFullNumber());
    System.out.println(newAdress.toString());


  }
}
