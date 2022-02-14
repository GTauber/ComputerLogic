package com.week1and2.tauber.model;

import java.util.Calendar;

public class People extends Calendar {
    Calendar birthday;
    Long yDays;
    Calendar today;

    public People(int month, int day, int year) {
        today = Calendar.getInstance();
        this.set(MONTH, month - 1);
        this.set(YEAR, year);
        this.set(DAY_OF_MONTH, day);
    }

    public Long convertAgeToDays(People birthday) {
        if (today.get(MONTH) > birthday.get(MONTH)) {
            // Case 1 Already made anniversary
            int monthInDays;
            yDays = ((long) (today.get(YEAR) - birthday.get(YEAR)) * 365);
            monthInDays = today.get(MONTH) * 30;
            monthInDays -= birthday.get(MONTH) * 30;
            yDays += monthInDays;
        } else {

            yDays = ((long) (today.get(YEAR) - this.get(YEAR)) - 1) * 365;
            yDays += (today.get(MONTH)) * 30;
            yDays += (((birthday.get(MONTH) + 1) - 12) * 30) * -1; // this -1 is to add months from the year before.
            yDays += (today.get(DATE));
            //TODO Add days of the month of your birthday
            //TODO EASIER WAY IS JUST SUBSTRACT dates, as day - day, month - month * 30, year - year * 365
        }
        return yDays;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    protected void computeTime() {

    }

    @Override
    protected void computeFields() {

    }

    @Override
    public void add(int field, int amount) {

    }

    @Override
    public void roll(int field, boolean up) {

    }

    @Override
    public int getMinimum(int field) {
        return 0;
    }

    @Override
    public int getMaximum(int field) {
        return 0;
    }

    @Override
    public int getGreatestMinimum(int field) {
        return 0;
    }

    @Override
    public int getLeastMaximum(int field) {
        return 0;
    }
}
