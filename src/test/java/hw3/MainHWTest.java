package hw3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MainHWTest {

    @Test
    void testEvenOddNumber() {
        MainHW mainHW = new MainHW();

        // Тест на четное число
        assertTrue(mainHW.evenOddNumber(4));

        // Тест на нечетное число
        assertFalse(mainHW.evenOddNumber(7));

        // Тест на ноль (считается четным)
        assertTrue(mainHW.evenOddNumber(0));

        // Тест на отрицательное четное число
        assertTrue(mainHW.evenOddNumber(-6));

        // Тест на отрицательное нечетное число
        assertFalse(mainHW.evenOddNumber(-9));
    }

    @Test
    void testNumberInInterval() {
        MainHW mainHW = new MainHW();

        // Тест для числа в пределах интервала
        assertTrue(mainHW.numberInInterval(50));

        // Тест для нижней границы интервала
        assertFalse(mainHW.numberInInterval(25));

        // Тест для верхней границы интервала
        assertFalse(mainHW.numberInInterval(100));

        // Тест для числа ниже нижней границы
        assertFalse(mainHW.numberInInterval(20));

        // Тест для числа выше верхней границы
        assertFalse(mainHW.numberInInterval(105));
    }
}

