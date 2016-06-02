/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terrance.maventest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author qizhi
 */
public class LoggerTest {
//    private Log log = LogFactory.getLog(LoggerTest.class);
    private static Logger log2 = LogManager.getLogger(LoggerTest.class);
    
    
    public static void main(String[] args) {
        log2.debug("error");
        log2.info("error");
        log2.warn("error");
        log2.error("error");
    }
}
