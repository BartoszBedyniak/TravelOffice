package pl.accenture;

public class Date {
    private int year;
    private int day;
    private int month;
    public Date(int year,int month, int day) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public String toString()
    {
        return getYear()+"/"+getMonth()+"/"+getDay();
    }
}
