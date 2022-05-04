package bai1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() { return hour; }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSecond() { return second; }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() { return minute; }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Time(int hour, int minute, int second) {
        if (hour >= 1 && hour <= 23) {
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }
    public String toString() {
        String s = "";
        if (hour < 10 && minute < 10 && second < 10) {
            s = "0" + this.hour + ":" + "0" + this.minute + ":" + "0" + this.second;
        } else if (hour >= 10 && minute > 10 && second >= 10) {
            s = this.hour + ":" + this.minute + ":" + this.second;
        } else if (hour < 10 && minute >= 10 && second >= 10) {
            s = "0" + this.hour + ":" + this.minute + ":" + this.second;
        } else if (hour == 0) {
            s = "00" + ":" +  this.minute + ":" + this.second;
        } else if (minute == 0) {
            s =  this.hour + "00" + ":" + this.second;
        }
        return s;
    }
}
