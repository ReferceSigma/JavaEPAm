package main.Glava1;

import java.util.Scanner;

public class zadA2 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String name = inputString.next();
        String reversedString = new StringBuffer(name).reverse().toString();
        System.out.println(reversedString);
        inputString.close();
}}