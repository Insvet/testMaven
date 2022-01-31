package lesson4.tests;

import lesson4.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFunction {
    @Test
    void CalculateAreaTest() {
        Assertions.assertEquals(Function.CalculateArea(6, 5, 5),12);
    }
}