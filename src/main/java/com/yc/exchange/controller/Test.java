package com.yc.exchange.controller;

import java.time.LocalDate;


public class Test {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,
                6,
                21);

        LocalDate localDate1 = localDate.plusDays(100L);
        System.out.println(localDate1);

    }

}
