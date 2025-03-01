package oop.labor02.dateUtil;

public class DateUtil {
    public static boolean leapYear(int nyear) {
        if(nyear%400==0) {
            return true;
        }
        else {
            if(nyear%100==0) {
                return false;
            }
            else {
                if(nyear%4==0) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }

    public static boolean isValidDate(int year,int month,int day) {
        if(day>31 || day<1 || month>12 || month<1 || year<1) {
            return false;
        }
        else {
            if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
                return true;
            }
            else {
                if(month==2) {
                    if(leapYear(year)==true) {
                        if(day<30) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                    else {
                        if(day<29) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                }
                else {
                    if(day<31) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
    }
}
