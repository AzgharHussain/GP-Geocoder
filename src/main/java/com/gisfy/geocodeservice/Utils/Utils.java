package com.gisfy.geocodeservice.Utils;

import org.json.JSONException;
import org.json.JSONObject;

public class Utils {

    public static JSONObject fetchLatLng(JSONObject jsonObject) throws JSONException {
        if (jsonObject.has("results")){
            return jsonObject.getJSONArray("results").getJSONObject(0).getJSONArray("locations").getJSONObject(0).getJSONObject("latLng");
        }
        return null;
    }
}
