package vn.fis.spro.customer.application.utils;

import java.sql.Timestamp;

public class DateUtils {

    private DateUtils() {

    }

    public static Timestamp parseStringToDateDDMMYYYY(String date) {
        return Timestamp.valueOf(date);
    }
}
