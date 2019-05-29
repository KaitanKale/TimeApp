package com.example.haari.timeapp;

/**
 * Created by haari on 5/28/2019.
 */

public class Time {
    private int hour;
    private int minute;
    private String prayerName;

    public Time(){
        hour = 5;
        minute = 15;
        prayerName = "Fajr" + "Dhuhr" + "Asr" + "Maghrib" + "Isha";
    }

    public void setTime(String prayerName) {
        this.hour = hour;
        this.minute = minute;
        this.prayerName = prayerName;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", prayerName='" + prayerName + '\'' +
                '}';
    }

    public String getTime(int hour, int minute, String prayerName) {
        return this.hour + ":" + this.minute;
    }
}
