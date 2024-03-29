package com.veerageolocation.api;

import java.util.Map;

/**
* This is the time zone object related to the Geo Location
*
* @author  Veera Mangipudi
* @version 1.0
* @since   2019-05-16 
*/


public class GeolocationTimezone {
    private String name;
    private Double offset;
    private String currentTime;
    private Double currentTimeUnix;
    private Boolean isDST;
    private Double dstSavings;

    GeolocationTimezone(Map json) {
        this.name = (String) json.get("name");
        this.offset = (Double) json.get("offset");
        this.currentTime = (String) json.get("current_time");
        this.currentTimeUnix = (Double) json.get("current_time_unix");
        this.isDST = (Boolean) json.get("is_dst");
        this.dstSavings = (Double) json.get("dst_savings");
    }

    public String getName() {
        return name;
    }

    public Double getOffset() {
        return offset;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public Double getCurrentTimeUnix() {
        return currentTimeUnix;
    }

    public Boolean isDST() {
        return isDST;
    }

    public Double getDSTSavings() {
        return dstSavings;
    }

    @Override
    public String toString() {
        return String.format("name: '%s' \noffset: '%s' \ncurrent_time: '%s' \ncurrent_time_unix: '%f' \nis_dst: '%b' \ndst_savings: '%s'", name, offset, currentTime, currentTimeUnix, isDST, dstSavings);
    }
}
