package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {

    public static boolean isAllPositiveNumbers(List<String> args) {
       return args.stream().allMatch(StringUtils::isPositiveNumber);
    }

    public static void main(String[] args) {
        System.out.println(isAllPositiveNumbers(List.of("1", "2", "3", "4")));
    }
}