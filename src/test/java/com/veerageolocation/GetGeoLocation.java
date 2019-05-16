package com.veerageolocation;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.veerageolocation.api.Geolocation;
import com.veerageolocation.api.GeolocationParams;
import com.veerageolocation.api.VeeraGeolocationAPI;
/**
* This is the Test class to validate the geo location
*
* @author  Veera Mangipudi
* @version 1.0
* @since   2019-05-16 
*/

public class GetGeoLocation {

	@Test
	public void test() {
		Map keys = new HashMap();
		VeeraGeolocationAPI api = new com.veerageolocation.api.VeeraGeolocationAPI("46d25ac8d08f4a9ea90506a13257d025");

		GeolocationParams geoParams = new GeolocationParams();
		//geoParams.setIPAddress("1.1.1.1");
		//geoParams.setIPAddress("192.168.0.107");
		//geoParams.setIPAddress("2.1.1.1");
		geoParams.setIPAddress("3.1.1.1");
		geoParams.setFields("geo,time_zone,currency");

		Geolocation geolocation = api.getGeolocation(geoParams);

		// Check if geolocation lookup was successful
		if (geolocation.getStatus() == 200) {
			System.out.println(geolocation.getCountryName());
			System.out.println(geolocation.getCurrency().getName());
			System.out.println(geolocation.getTimezone().getCurrentTime());

		} else {
			System.out.printf("Status Code: %d, Message: %s\n", geolocation.getStatus(), geolocation.getMessage());
			fail("Not yet implemented");
		}

	}

}
