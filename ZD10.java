package com.company;
import java.util.Scanner;
public class Main {
    public static void p(String sms){
        System.out.println(sms);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        isPalindrome(s);
    }
    public static String reverseString(String s){
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            p("Палиндром");
        }else{
            p("Не палиндром");
        }
        return s.equals(reverseString(s));
    }
