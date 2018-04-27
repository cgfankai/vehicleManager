package com.crfsdi.ic.sd.vehicleManager.util;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UtilTest {

    @Test
    public void test() {

        Pattern pattern = Pattern.compile("^[0-9]{6}$");
        Matcher matcher = pattern.matcher("006512");
        if (matcher.find()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}