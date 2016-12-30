package com.main.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {

    public static void main(String[] args) {
        String compareDate = compareDate(getCurrentDate(), getNextDate(1));
        System.out.println("compareDate = " + compareDate);
        
        ArrayList<String> betweenDate = betweenDate(getCurrentDate(), getNextDate(200));
        System.out.println("betweenDate = " + betweenDate.size());
    }

    public static String getCurrentDate() {
        Calendar instance = Calendar.getInstance();
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        return date + "-" + (month + 1) + "-" + year;
    }

    public static Integer getCurrentYear() {
        Calendar instance = Calendar.getInstance();
        return instance.get(Calendar.YEAR);
    }

    public static String getNextDate(int nextBy) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, nextBy);
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        return date + "-" + (month + 1) + "-" + year;
    }

    public static String getPreviousDate(int previousBy) {
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, -previousBy);
        int date = instance.get(Calendar.DAY_OF_MONTH);
        int month = instance.get(Calendar.MONTH);
        int year = instance.get(Calendar.YEAR);
        return date + "-" + (month + 1) + "-" + year;
    }

    public static String getSystemTime() {
        Calendar instance = Calendar.getInstance();
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);
        return hour + ":" + minute + ":" + second;
    }

    public static String getCurrentTime() {
        Calendar instance = Calendar.getInstance();
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int i = instance.get(Calendar.AM_PM);
        if (i == 0) {
            return hour + ":" + minute + " " + "AM";
        }
        return hour + ":" + minute + " " + "PM";
    }

    public static ArrayList<String> betweenDate(String str_date, String end_date) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            List<Date> dates = new ArrayList<>();
            DateFormat formatter;
            formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date startDate = (Date) formatter.parse(str_date);
            Date endDate = (Date) formatter.parse(end_date);
            long interval = 24 * 1000 * 60 * 60; // 1 hour in millis
            long endTime = endDate.getTime(); // create your endtime here, possibly using Calendar or Date
            long curTime = startDate.getTime();
            while (curTime <= endTime) {
                dates.add(new Date(curTime));
                curTime += interval;
            }
            for (int i = 0; i < dates.size(); i++) {
                Date lDate = (Date) dates.get(i);
                String ds = formatter.format(lDate);
                arrayList.add(ds);
            }
        } catch (Exception e) {
        }
        return arrayList;
    }

    public static String compareDate(String dateTo1, String dateTo2) {
        String string = "";
        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date1 = sdf.parse(dateTo1);
            Date date2 = sdf.parse(dateTo2);
            System.out.println("date1 : " + sdf.format(date1));
            System.out.println("date2 : " + sdf.format(date2));
            if (date1.after(date2)) {
                string = "After";
            }
            if (date1.before(date2)) {
                string = "Before";
            }

            if (date1.equals(date2)) {
                string = "Equal";
            }
        } catch (Exception e) {
        }
        return string;
    }

}
