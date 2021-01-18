package OOP;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public Time nextSecond(){
        int sumSec = second + 1 + minute * 60 + hour * 3600;
        int newHour = sumSec/3600;
        sumSec-=newHour*3600;
        int newMinutes = sumSec/60;
        sumSec-=newMinutes*60;
        return new Time(newHour,newMinutes,sumSec);
    }

    public Time previousSecond(){
        int sumSec = second - 1 + minute * 60 + hour * 3600;
        int newHour = sumSec/3600;
        sumSec-=newHour*3600;
        int newMinutes = sumSec/60;
        sumSec-=newMinutes*60;
        return new Time(newHour,newMinutes,sumSec);
    }
}
