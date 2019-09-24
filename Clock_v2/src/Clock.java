import java.sql.Time;

public class Clock
{
  private int hour, minute, second;

  Clock(int hour, int minute, int second)
  {
    if ((hour < 0 || hour > 24) && (minute < 0 || minute > 60) && (second < 0
        || second > 60))
    {
      System.out.println("ERROR 'invalid clock arguments'");
    }
    else
    {
      set(hour, minute, second);
    }

  }

  public Clock(int second)
  {
    set(second);
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
    return hour + ":"+ minute + ":" + second;
  }

  Time getSimpleTime()
  {
    return new Time(hour, minute, second);
  }

  public void set(int totalSeconds)
  {
    if (totalSeconds < 0||totalSeconds>216000)
    {
      set(0, 0, 0);
    }
    else
    {
      int s = totalSeconds % 60;
      int m = (totalSeconds / 60) % 60;
      int h = totalSeconds / 3600;
      set(h, m, s);
    }
  }

  public void tic()
  {
    set(getTimeInSeconds() + 1);
  }

  public boolean isBefore(Clock clock)
  {
    return clock.getTimeInSeconds() > this.getTimeInSeconds();
  }

  public Clock timeTo(Clock clock){
        Clock clock2 =new Clock(clock.getTimeInSeconds()-this.getTimeInSeconds());
        if (clock2.getTimeInSeconds()<0){
          clock2.set(getTimeInSeconds()*(-1));
        }
        return clock2;
  }

}
