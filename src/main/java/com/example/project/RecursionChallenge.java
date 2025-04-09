    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 0) {
                    return 0;
                }
                else {
                    return 2 + bunnyEars(n-1);
                }
            }
        
            public static int factorial(int n){
                if (n < 2) {
                    return n;
                }
                else {
                    return n * factorial(n-1);
                }
            }

            public static int sumNumbers(int n){
                if (n == 0) {
                    return 0;
                }
                else {
                    return n + sumNumbers(n-1);
                }
            }

            public static String countDown(int n){
                if (n == 0) {
                    return "Blast Off!";
                }
                else {
                    return n + " " + countDown(n-1);
                }
                
            }

            public static int power(int x, int n){
                if (n == 1) {
                    return x;
                }
                else {
                    return x * power(x, n-1);
                }
            }

            public static int fib(int n){
                if (n < 2) {
                    return n;
                }
                else {
                    return fib(n-2) + fib(n-1);
                }
            }

            public static int countX(String s){
                if (s.length() < 2) {
                    return s.indexOf("x") + 1;
                }
                else {
                    int mid = (s.length() / 2);
                    return countX(s.substring(0, mid)) + countX(s.substring(mid));
                }
            }

            public static String changePi(String s){
                if (s.length() == 1) {
                    return s;
                }
                else if (s.startsWith("pi") && s.length() == 2) {
                    return "3.14";
                }  
                else {
                    if (s.startsWith("pi")) {
                        return "3.14" + changePi(s.substring(2));
                    }
                    else {
                        return s.substring(0, 1) + changePi(s.substring(1));
                    }
                }
            }


            public static String reverse(String s){
                if (s.length() < 2) {
                    return s;
                }
                else {
                    return reverse(s.substring(1)) + reverse(s.substring(0, 1));
                }
            }

            public static Boolean isPalindrome(String s){
                if (s.length() < 2) {
                    return true;
                }
                if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                    return isPalindrome(s.substring(1, s.length() - 1));
                   
                }
                else {
                    return false;
                }
            }

    }