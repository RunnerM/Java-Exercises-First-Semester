import java.sql.Time;

public class Clock
{
  private int hour, minute, second;

  Clock(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  void set(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  int getTimeInSeconds()
  {
    return (hour * 3600) + (minute * 60) + second;
  }

  public String toString()
  {
    return hour + ":" + minute + ":" + second;
  }
  Time getSimpleTime(){
    return new Time(hour,minute,second);
  }
}
