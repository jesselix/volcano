package li.jesse.volcanocommon.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {


    public static int compareIgnoreSecond(Date date1, Date date2) {
        if (date1 == null) {
            date1 = new Date();
        }

        if (date2 == null) {
            date2 = new Date();
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        date1 = cal.getTime();

        cal.setTime(date2);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        date2 = cal.getTime();

        return date1.compareTo(date2);
    }

    public static String currentDate2String() {
        return date2String(new Date());
    }

    public static String date2String(Date date) {
        return date2String(date, "yyyy-MM-dd HH:mm:ss.SSS");
    }

    public static String date2String(Date date, String pattern) {
        if (date == null) {
            return null;
        }

        return (new SimpleDateFormat(pattern)).format(date);
    }

    public static String dateStringToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    public static String stampToDateString(String s) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = Long.valueOf(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    public static long dateToStamp(int year, int month, int day) throws ParseException {
        String res = year + "-" + month + "-" + day;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(res);
        long ts = date.getTime();
        return ts;
    }

    public static long timeStampNow() {
        Date now = new Date();
        String timestamp = String.valueOf(now.getTime());
        return Long.valueOf(timestamp);
    }

    public static long timeStampNow2() {
        Date now = new Date();
        String timestamp = String.valueOf(now.getTime()/1000);
        return Long.valueOf(timestamp);
    }

    /**
     * get the date after n months
     * @param inputDate
     * @param n
     * @return
     */
    public static String dateAfterMonths(String inputDate, int n) {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(inputDate);
        } catch(Exception e) {

        }
        c.setTime(date);
        c.add(Calendar.MONTH, n);
        String strDate = sdf.format(c.getTime());
        return strDate;
    }

}
