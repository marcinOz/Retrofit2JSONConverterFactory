package app.solocoo.tv.solocoo.network.custom_converters;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by MarcinOz on 2016-04-21.
 * Copyright (C) 2016 OKE Poland Sp. z o.o. All rights reserved.
 */
public class JSONResponseBodyConverters {
    private JSONResponseBodyConverters() {}

    static final class JSONObjectResponseBodyConverter implements Converter<ResponseBody, JSONObject> {
        static final JSONObjectResponseBodyConverter INSTANCE = new JSONObjectResponseBodyConverter();

        @Override public JSONObject convert(ResponseBody value) throws IOException {
            try {
                return new JSONObject(value.string());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    static final class JSONArrayResponseBodyConverter implements Converter<ResponseBody, JSONArray> {
        static final JSONArrayResponseBodyConverter INSTANCE = new JSONArrayResponseBodyConverter();

        @Override public JSONArray convert(ResponseBody value) throws IOException {
            try {
                return new JSONArray(value.string());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
