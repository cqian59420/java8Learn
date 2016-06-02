/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terrance.maventest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author qizhi
 */
public class Joda {

    public static void main(String[] args) {
        System.out.println( DateTime.now().toString("yyyyMMddHHmmssSSS"));
        System.out.println(Math.round(Math.random()* 100));
        
    }
    
}
