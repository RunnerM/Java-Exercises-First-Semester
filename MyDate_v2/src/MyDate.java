public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void set(int day, int month, int year)
  {
    if(day <1) day=1;
    else if (day>numberOfDaysInMonth())day=numberOfDaysInMonth();
    this.day = day;
    if(month<1) month = 1;
    else if( month >12) month = 12;
    this.month = month;
    if(year<0)year=-year;
    this.year = year;

  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

  public boolean isLeapYear (){
    return  (year%4==0) && (year % 100!= 0 || year % 400==0);
  }
  public int numberOfDaysInMonth(){return 0;}
  public String getMonthName(){
    switch (month){
      case 1:return "January";
      case 2:return "February";
      case 3:return "March";
      case 4:return "April";
      case 5:return "May";
      case 6:return "June";
      case 7:return "July";
      case 8:return "August";
      case 9:return "September";
      case 10:return "October";
      case 11:return "November";
      default:return "December";
    }
  }

}
