package com.veerageolocation.api;

import java.util.Map;

/**
* This is the currency object related to the Geo Location
*
* @author  Veera Mangipudi
* @version 1.0
* @since   2019-05-16 
*/

public class GeolocationCurrency {
    private String name;
    private String code;
    private String symbol;

    GeolocationCurrency(Map json) {
        this.name = (String) json.get("name");
        this.code = (String) json.get("code");
        this.symbol = (String) json.get("symbol");
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.format("name: '%s' \ncode: '%s' \nsymbol: '%s'", name, code, symbol);
    }
}
