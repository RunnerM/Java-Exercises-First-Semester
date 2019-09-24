public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this(hour * 3600 + minute * 60 + second);
    }

    public Time(int timeInSeconds) {
        if (timeInSeconds < 0) {
            timeInSeconds = 0;
        }
        this.hour = timeInSeconds / 3600;
        this.minute = (timeInSeconds % 3600) / 60;
        this.second = (timeInSeconds % 3600) % 60;
    }
    public void set(int timeInSeconds){
        this.hour= timeInSeconds/3600;
        this.minute= timeInSeconds%3600/60;
        this.second= timeInSeconds%3600%60;
    }
    public void set(int h,int m,int s){
        this.second=s;
        this.minute=m;
        this.hour=h;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getTimeInSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time copy(){
        return new Time(this.hour,this.minute,this.second);
    }
}

