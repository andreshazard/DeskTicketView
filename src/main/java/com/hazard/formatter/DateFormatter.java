package com.hazard.formatter;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * Created by andreshazard on 5/15/16.
 */
public final class DateFormatter {


    // class can not be instantiate
    private DateFormatter() {
    }

    public static String convertDate(String originalDate) {

        DateTime dateTime = ISODateTimeFormat.dateTimeParser().parseDateTime(originalDate);

        // Usually better to specify a time zone than rely on default.
        DateTimeZone timeZone = DateTimeZone.forID( "America/Los_Angeles" );
        DateTimeFormatter formatter = DateTimeFormat.forPattern( "yyyy-MM-dd HH:mm 'PST' " ).withZone( timeZone );

        // Parse string into a DateTime. Passing to constructor conveniently uses the built-in ISO 8601 parser built
        // into DateTime class.
        DateTime dateTime2 = new DateTime( dateTime, timeZone );

        // Render date-time as a string in a particular format
        String output = formatter.print( dateTime2 );
        return output;

    }

}
