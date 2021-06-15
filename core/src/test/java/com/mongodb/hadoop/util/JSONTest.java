/*
 * Copyright (C) 2010-2021 Evergage, Inc.
 * All rights reserved.
 */

package com.mongodb.hadoop.util;

import com.mongodb.DBObject;
import org.apache.hadoop.conf.Configuration;
import org.junit.Test;

/**
 */
public class JSONTest {
    @Test
    public void test(){
        DBObject multiUriConfig = MongoConfigUtil.getDBObject(new Configuration(), "MULTI_COLLECTION_CONF_KEY");
    }
}
