package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/*

0528 Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде «21 12 2020«.

Требования:
1. Дата должна содержать день, месяц и год, разделенные пробелом.
2. День должен соответствовать текущему.
3. Месяц должен соответствовать текущему.
4. Год должен соответствовать текущему.
5. Вся дата должна быть выведена в одной строке.
Вывести на экран сегодняшнюю дату


*/

// public class Solution
public class Main {
    public static void main(String[] args) {
       Date toDay = new Date(24, 10, 2020);
       System.out.println(toDay);
    }
    public static class Date {
        int day;
        int month;
        int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public String toString() {
            return (day + " " + month + " " + year);
        }
    }
    
}







