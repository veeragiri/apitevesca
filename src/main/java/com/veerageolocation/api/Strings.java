package com.veerageolocation.api;


/**
* This is the string utility object 
*
* @author  Veera Mangipudi
* @version 1.0
* @since   2019-05-16 
*/


class Strings {

    static String nullToEmpty(String s) {
        if(s == null) {
            s = "";
        }
        return s;
    }

    static Boolean isNullOrEmpty(String string) {
        return string == null || string.trim().equals("");
    }
}
