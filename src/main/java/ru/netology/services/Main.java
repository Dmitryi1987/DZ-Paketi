package ru.netology.services;
public class Main {

    public static void main(String[] args) {
        int income = 100_000; // доход от работы
        int expenses = 60_000; // обязательные месячные траты
        int threshold = 150_000; // количество денег для отдыха
        int money;
        int month;

        MonthService service = new MonthService();

        System.out.println(service.calculate(income,expenses,threshold));
    }
}