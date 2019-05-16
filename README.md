
My geo location API Key
46d25ac8d08f4a9ea90506a13257d025 

# Veera Geolocation API Java

## Introduction
[IPGeolocation API](https://ipgeolocation.io) is the solution to identify country code (ISO2 and ISO3 standard), country name, continent code, continent name, country capital, state/province, district, city, zip code, latitude and longitude of city, is country belongs to Europian Union, calling code, top level domain (TLD), languages, country flag, internet service provider (ISP), connection type, organization, geoname ID, currency code, currency name, time zone ID, time zone offset, current time in the time zone, is time zone in daylight saving time, and total daylight savings. This document provides important information to help you get up to speed with IPGeolocation API using IP Geolocation API Java SDK.

D

## System Requirements

IP Geolocation API Java SDK has been developed and tested on JDK version 8.  
Note: Internet connection is required to run this component.

## Installation
 Java SDK can be installed by various methods given below:

### Maven

Add the following dependency in 'pom.xml' file to use the IP Geolocation API Java SDK.

```maven
<dependency>
    <groupId>com.ipgeolocation</groupId>
    <artifactId>ipgeolocation</artifactId>
    <version>1.0.5</version>
</dependency>
```


Basic Usage
-----------

### Setup API

```java
// Create IPGeolocationAPI object, passing your valid API key
IPGeolocationAPI api = new IPGeolocationAPI("YOUR_API_KEY");

MY API KEY - 46d25ac8d08f4a9ea90506a13257d025
```

### Geolocation Lookup

```java
// Get geolocation for IP address (1.1.1.1) and fields (geo, time_zone and currency)
GeolocationParams geoParams = new GeolocationParams();
geoParams.setIPAddress("1.1.1.1");
geoParams.setFields("geo,time_zone,currency");

Geolocation geolocation = api.getGeolocation(geoParams);

// Check if geolocation lookup was successful
if(geolocation.getStatus() == 200) {
    System.out.println(geolocation.getCountryName());
    System.out.println(geolocation.getCurrency().getName());
    System.out.println(geolocation.getTimezone().getCurrentTime());
} else {
    System.out.printf("Status Code: %d, Message: %s\n", geolocation.getStatus(), geolocation.getMessage());
}

// Get geolocation in Russian** for IP address (1.1.1.1) and all fields
GeolocationParams geoParams = new GeolocationParams();
geoParams.setIPAddress("1.1.1.1");
geoParams.setLang("ru");

Geolocation geolocation = api.getGeolocation(geoParams);

// Check if geolocation lookup was successful
if(geolocation.getStatus() == 200) {
    System.out.println(geolocation.getIPAddress());
    System.out.println(geolocation.getCountryName());
} else {
    System.out.printf("Status Code: %d, Message: %s\n", geolocation.getStatus(), geolocation.getMessage());
}

// Get geolocation for the calling machine's IP address for all fields
Geolocation geolocation = api.getGeolocation();

if(geolocation.getStatus() == 200) {
    System.out.println(geolocation.getCountryCode2());
    System.out.println(geolocation.getTimezone().getCurrentTime());
} else {
    System.out.printf("Status Code: %d, Message: %s\n", geolocation.getStatus(), geolocation.getMessage());
}
```

