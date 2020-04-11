package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @ParameterizedTest()
    @CsvFileSource(resources = "/data.csv")

    void shouldCalculate(String test, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
