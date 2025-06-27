package BuiltInFunction;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZonesAndZonedDateTime {
    public static void main(String[] args) {

        //Defines the format of date time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Storing the zone id of Greenwich mean time
        ZoneId gmtZoneId = ZoneId.of("GMT");
        //Storing the Greenwich mean time
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZoneId);
        //Storing the Greenwich mean time in the format yyyy-MM-dd HH:mm:ss
        String GMT = formatter.format(gmtTime);

        //Storing the zone id of Indian Standard time
        ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
        //Storing the Indian Standard time
        ZonedDateTime istTime = ZonedDateTime.now(istZoneId);
        //Storing the Indian Standard time in the format yyyy-MM-dd HH:mm:ss
        String IST = formatter.format(istTime);

        //Storing the zone id of Pacific Standard time
        ZoneId pstZoneId = ZoneId.of("America/Los_Angeles");
        //Storing the Pacific Standard time
        ZonedDateTime pstTime = ZonedDateTime.now(pstZoneId);
        //Storing the Pacific Standard time in the format yyyy-MM-dd HH:mm:ss
        String PST = formatter.format(pstTime);

        //display current time of GMT ,IST,PST
        System.out.println("The current date and time of Greenwich mean time : "+GMT);
        System.out.println("The current date and time of Indian Standard time : "+IST);
        System.out.println("The current date and time of Pacific Standard time : "+PST);

    }
}
