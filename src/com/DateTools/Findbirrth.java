package com.DateTools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Findbirrth {
    public static void main(String[] args) throws ParseException {
        Date d = null;
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        String s = "1991-12-18";
        d  = sdf.parse(s);
        //日历获取时间等
        Calendar calendar = Calendar.getInstance();
        calendar.set(1991,12,15);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
