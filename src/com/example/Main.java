package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a month:");
        int startMonthOrdinal = 0;
        String userInput = scanner.nextLine();
        List<Month> monthList = new ArrayList();
        for(Month month : Month.values() ){
            if(userInput.equals(month.getEnglishName())){
                startMonthOrdinal = month.ordinal();
                System.out.println("We found the name");

            }
        }
        for(Month month : Month.values()){
            if (startMonthOrdinal <= month.ordinal()){
                monthList.add(month);
            }
        }
        System.out.println(monthList.toString());

    }
}
