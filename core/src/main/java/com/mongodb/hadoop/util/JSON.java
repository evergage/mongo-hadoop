/*
 * Copyright (C) 2010-2021 Evergage, Inc.
 * All rights reserved.
 */

package com.mongodb.hadoop.util;

import com.google.gson.Gson;

/**
 * com.mongodb.util.JSON was removed in mongo 4.x
 */
public class JSON<T> {

    public static String serialize(Object object){
        return new Gson().toJson(object);
    }

    public T parse(String value, Class<T> def){
        return new Gson().fromJson(value, def);
    }
}
