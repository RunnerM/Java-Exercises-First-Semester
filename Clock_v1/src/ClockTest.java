public class ClockTest
{
  public static void main(String[] args)
  {
    Clock myClock = new Clock(21,34,12);
    System.out.println(myClock);
    System.out.println(myClock.getTimeInSeconds());
    System.out.println(myClock.toString());
    myClock.set(13,45,23);
    System.out.println(myClock);
    System.out.println(myClock.getTimeInSeconds());
    System.out.println(myClock.toString());
    System.out.println(myClock.getSimpleTime().toString());
  }
}
