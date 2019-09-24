import java.util.Scanner;

public class MyDateTest
{

  public static void main(String[] args)
  {
    int day;
    int month;
    int year;
    Scanner input = new Scanner(System.in);
    day= Integer.parseInt(input.nextLine());
    month= Integer.parseInt(input.nextLine());
    year= Integer.parseInt(input.nextLine());
    MyDate date1= new MyDate(day,month,year);

    System.out.println(date1);

    date1.set(24,12,2019);

    System.out.println(date1.getDay()+"/"+date1.getMonth()+"/"+date1.getYear());

    System.out.println(date1.toString());
    input.close();
  }
}
