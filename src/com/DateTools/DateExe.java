package com.DateTools;

import javax.print.DocFlavor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExe {
    public static void main(String[] args) {
        //DateFormat
        Date d =new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        System.out.println(dateFormat.format(d));
        //SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String da = sdf.format(d);
        System.out.println(da);


    }
}
