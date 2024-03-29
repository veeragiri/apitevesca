package com.veerageolocation.api;


/**
* This is the Parameters of the Timezone related to the Geo Location
*
* @author  Veera Mangipudi
* @version 1.0
* @since   2019-05-16 
*/

public class TimezoneParams {
    private String timezone;
    private String ip;
    private String lang;
    private Double latitude;
    private Double longitude;

    public TimezoneParams() {
        this.timezone = "";
        this.ip = "";
        this.lang = "en";
        this.latitude = 1000.0;
        this.longitude = 1000.0;
    }

    public void setTimezone(String timezone) {
        this.timezone = Strings.nullToEmpty(timezone);
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setIPAddress(String ip) {
        this.ip = Strings.nullToEmpty(ip);
    }

    public String getIPAddress() {
        return this.ip;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLocation(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    @Override
    public String toString() {
        return String.format("IP Address: '%s', Lang: '%s', Location: '%f, %f'", ip, lang, latitude, longitude);
    }
}
