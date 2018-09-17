package com.job.ui.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wangemngeli on 2018/09/10.
 * 读取配置文件
 */
public class PropertiesHandle {
    public static String readValue(String key) {
        Properties props = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream("config.properties"));
            props.load(in);
            String value = props.getProperty(key);
            return value;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
