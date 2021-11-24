package com.dataflair.reminderapp;

//model class is used to set and get the data from database

public class Model {
    String title, mdescp, date, time;


    public Model(String title,String descp, String date, String time) {
        this.title = title;
        this.mdescp= descp;
        this.date = date;
        this.time = time;
    }


    public String getTitle() {
        return title;
    }
    public String getdescp() {
        return mdescp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescp(String descp) {
        this.mdescp = descp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
