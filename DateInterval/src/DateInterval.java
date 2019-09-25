import java.util.Objects;

public class DateInterval {
    private int days;
    private MyDate startDate;

    public DateInterval(int days, MyDate startDate) {
        this.days = days;
        this.startDate = startDate.copy();
    }

    public DateInterval(int day, int month, int year, int days) {
        this.days = days;
        this.startDate = new MyDate(day, month, year);
    }

    public DateInterval(MyDate startDate, MyDate endDate) {
        this.startDate = startDate.copy();
        this.days = 0;
        while (!startDate.equals(endDate)) {
            this.days++;
            startDate.stepForwardOneDay();
        }
    }

    public int getDays() {
        return days;
    }

    public MyDate getStartDate() {
        return startDate;
    }

    public MyDate getEndDate() {
        MyDate h1 = this.startDate;
        h1.stepForward(this.days);
        return h1;
    }

    public boolean overlap(DateInterval otherDateInterval) {
        if (otherDateInterval.getStartDate().isBefore(this.getEndDate())) {
            return true;
        }
        if (this.getStartDate().isBefore(otherDateInterval.getEndDate())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateInterval that = (DateInterval) o;
        return getDays() == that.getDays() &&
                getStartDate().equals(that.getStartDate());
    }

    @Override
    public String toString() {
        return "DateInterval{" +
                "days=" + days +
                ", startDate=" + startDate +
                '}';
    }
}
