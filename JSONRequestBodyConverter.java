package app.solocoo.tv.solocoo.network.custom_converters;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/**
 * Created by MarcinOz on 2016-04-21.
 * Copyright (C) 2016 OKE Poland Sp. z o.o. All rights reserved.
 */
public class JSONRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final JSONRequestBodyConverter<Object> INSTANCE = new JSONRequestBodyConverter<>();
    private static final MediaType MEDIA_TYPE = MediaType.parse("text/plain; charset=UTF-8");

    private JSONRequestBodyConverter() {
    }

    @Override public RequestBody convert(T value) throws IOException {
        return RequestBody.create(MEDIA_TYPE, String.valueOf(value));
    }
}
