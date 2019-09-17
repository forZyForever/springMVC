package com.Capcom.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myDateConvert implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        //将字符串转化为自己想要的格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
