package com.jumtest.test.video;

import com.jumtest.testbase.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test extends TestBase {
    Logger log = LoggerFactory.getLogger(com.jumtest.test.test.class);

    @Test()
    public void test() {
        log.debug("halo_debug");
        log.info("halo_info ");
        log.warn("halo_warn");
        log.error("halo_error");
        System.out.println(1111);
        Reporter.log("测试完成");
    }
}