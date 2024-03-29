package com.veerageolocation.api;

import com.google.gson.internal.LinkedTreeMap;

import java.util.Map;


/**
* This is the Time zone object
*
* @author  Veera Mangipudi
* @version 1.0
* @since   2019-05-16 
*/


public class Timezone {
    private Integer status;
    private String message;
    private String timezone;
    private Double timezoneOffset;
    private String date;
    private String dateTime;
    private String dateTimeTxt;
    private String dateTimeWti;
    private String dateTimeYmd;
    private Double dateTimeUnix;
    private String time24;
    private String time12;
    private String week;
    private String month;
    private String year;
    private String yearAbbr;
    private Boolean isDST;
    private Double dstSavings;
    private TimezoneGeo timezoneGeo;

    Timezone(Map<String, Object> json) {
        this.status = Integer.parseInt((String) json.get("status"));
        String message = (String) json.get("message");

        if(this.status != 200 || message != null) {
            this.message = message;
        } else {
            this.timezone = (String) json.get("timezone");
            this.timezoneOffset = (Double) json.get("timezone_offset");
            this.date = (String) json.get("date");
            this.dateTime = (String) json.get("date_time");
            this.dateTimeTxt = (String) json.get("date_time_txt");
            this.dateTimeWti = (String) json.get("date_time_wti");
            this.dateTimeYmd = (String) json.get("date_time_ymd");
            this.dateTimeUnix = (Double) json.get("date_time_unix");
            this.time24 = (String) json.get("time_24");
            this.time12 = (String) json.get("time_12");
            this.week = (String) json.get("week");
            this.month = (String) json.get("month");
            this.year = (String) json.get("year");
            this.yearAbbr = (String) json.get("year_abbr");
            this.isDST = (Boolean) json.get("is_dst");
            this.dstSavings = (Double) json.get("dst_savings");

            if(json.get("geo") instanceof LinkedTreeMap) {
                Map geoJson = (LinkedTreeMap) json.get("geo");
                this.timezoneGeo = new TimezoneGeo(geoJson);
            }
        }
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getTimezone() {
        return timezone;
    }

    public Double getTimezoneOffset() {
        return timezoneOffset;
    }

    public String getDate() {
        return date;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getDateTimeTxt() {
        return dateTimeTxt;
    }

    public String getDateTimeWti() {
        return dateTimeWti;
    }

    public String getDateTimeYmd() {
        return dateTimeYmd;
    }

    public Double getDateTimeUnix() {
        return dateTimeUnix;
    }

    public String getTime24() {
        return time24;
    }

    public String getTime12() {
        return time12;
    }

    public String getWeek() {
        return week;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getYearAbbr() {
        return yearAbbr;
    }

    public Boolean isDST() {
        return isDST;
    }

    public Double getDSTSavings() {
        return dstSavings;
    }

    public TimezoneGeo getTimezoneGeo() {
        return timezoneGeo;
    }

    @Override
    public String toString() {
        String timezoneGeoString = "";

        if(timezoneGeo != null) {
            timezoneGeoString = timezoneGeo.toString();
        }

        return String.format("timezone: '%s', \ntimezone_offset: '%s', \ndate: '%s', \ndate_time: '%s', \ndate_time_txt: '%s', \ndate_time_wti: '%s', \ndate_time_ymd: '%s', \ndate_time_unix: '%f', \ntime_24: '%s', \ntime_12: '%s', \nweek: '%s', \nmonth: '%s', \nyear: '%s', \nyear_abbr: '%s', \nis_dst: '%s', \ndst_savings: '%s', \ngeo: {\n%s\n}\n", timezone, timezoneOffset, date, dateTime, dateTimeTxt, dateTimeWti, dateTimeYmd, dateTimeUnix, time24, time12, week, month, year, yearAbbr, isDST, dstSavings, timezoneGeoString);
    }
}
