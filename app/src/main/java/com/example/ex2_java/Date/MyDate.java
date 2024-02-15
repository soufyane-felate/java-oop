package com.example.ex2_java.Date;



public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public void Afficher() {
        System.out.println("Day: " + day + ", Month: " + month + ", Year: " + year);
    }

    public boolean isBissextile() {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

class MyMath {
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Main {
    public static void main(String[] args) {

        MyDate date = new MyDate(13, 2, 2024);
        System.out.println("Date: " + date);
        System.out.println("Is bissextile? " + date.isBissextile());


        MyMath math = new MyMath();
        int n = 5;
        System.out.println("Factorial of " + n + ": " + math.factorial(n));
        int m = 26;
        System.out.println("Is " + m + " prime? " + math.isPrime(m));
    }
}



