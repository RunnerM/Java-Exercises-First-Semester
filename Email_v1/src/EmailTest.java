import java.util.Scanner;

public class EmailTest
{
  public static void main(String[] args)
  {
    String user;
    String host;
    String domain;
    Scanner input = new Scanner(System.in);
    user=input.nextLine();
    host=input.nextLine();
    domain= input.nextLine();
    Email User1 = new Email(user,host,domain);

    System.out.println(User1.getUser());
    System.out.println(User1.getHost());
    System.out.println(User1.getDomain());
    System.out.println(User1.toString());
  }
}
