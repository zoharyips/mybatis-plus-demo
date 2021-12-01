package com.example.mp.demo.config.db;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Please enter the class name.
 *
 * @author zohar
 * @version 1.0
 * 2021-12-02 01:39
 */
class MybatisLogInterceptorTest {

    @Test
    void parseObjToStringParam() {
        assertEquals("1024", MybatisLogInterceptor.parseObjToStringParam(1024));
        assertEquals("'1024'", MybatisLogInterceptor.parseObjToStringParam("1024"));
        assertEquals("'2021-12-1 12:00:00'", MybatisLogInterceptor.parseObjToStringParam(new Date(2021 - 1900, Calendar.DECEMBER, 1, 12, 0, 0)));
    }
}