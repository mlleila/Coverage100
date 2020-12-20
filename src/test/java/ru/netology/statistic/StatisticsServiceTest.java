package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;
    long actual = service.findMax(incomesInBillions);
    assertEquals(expected, actual);
  }
  @Test
  void shouldCalculateSum() {
    StatisticsService service = new StatisticsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 180;
    long actual = service.calculateSum(purchases);
    assertEquals(expected, actual);
  }

  @Test
  void shouldCalculateAverageSum() {
    StatisticsService service = new StatisticsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 15;
    long actual = service.calculateAverageSum(purchases);
    assertEquals(expected, actual);
  }

  @Test
  void shouldCalculateNumberOfMonthWithMaxPurchases() {
    StatisticsService service = new StatisticsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 7;
    long actual = service.numberOfMonthWithMaxPurchases(purchases);
    assertEquals(expected, actual);
  }

  @Test
  void shouldCalculateNumberOfMonthWithMinPurchases() {
    StatisticsService service = new StatisticsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 8;
    long actual = service.numberOfMonthWithMinPurchases(purchases);
    assertEquals(expected, actual);
  }
  @Test
  void shouldCalculateNumberOfMonthsUnderAverageSum() {
    StatisticsService service = new StatisticsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 5;
    long actual = service.numberOfMonthsUnderAverageSum(purchases);
    assertEquals(expected, actual);
  }

  @Test
  void shouldCalculateNumberOfMonthsOverAverageSum() {
    StatisticsService service = new StatisticsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 5;
    long actual = service.numberOfMonthsOverAverageSum(purchases);
    assertEquals(expected, actual);
  }

}