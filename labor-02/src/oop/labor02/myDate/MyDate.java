package oop.labor02.myDate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int nyear,int nmonth,int nday) {
        year=nyear;
        month=nmonth;
        day=nday;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return "MyDate is:"+year+"."+month+"."+day+".";
    }
}
