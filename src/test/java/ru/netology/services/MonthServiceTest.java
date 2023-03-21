package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/incomeExpensesThresholdExpected.csv")
    public void monthservicedata( int income, int expenses, int threshold, int expected) {
        MonthService service = new MonthService();
        //int income = 10_000; // доход от работы
        //int expenses = 3_000; // обязательные месячные траты
        //int threshold = 20_000; // количество денег для отдыха
        //int expected = 3;

        int actual = service.calculate(income,expenses,threshold);

        Assertions.assertEquals(expected, actual);
    }
}

//    @Test
//    void monthservicedata2() {
//        MonthService service = new MonthService();
//        int income = 100_000; // доход от работы
//        int expenses = 60_000; // обязательные месячные траты
//        int threshold = 150_000; // количество денег для отдыха
//        int expected = 2;
//
//        int actual = service.calculate(income,expenses,threshold);
//
//        Assertions.assertEquals(expected, actual);
//    }
//}