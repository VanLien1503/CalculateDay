import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {
    @Test
    @DisplayName("1/1/2020 - 2/1/2020")
    void nextDay1_1_2020() {
        int inputDay=1;
        int inputMonth=1;
        int inputYear=2020;
        String expected = "2/1/2020";
        String actual=NextDayCalculator.nextDay(inputDay,inputMonth,inputYear);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("31/1/2020 - 1/2/2020")
    void nextDay1_2_2020() {
        int inputDay=31;
        int inputMonth=1;
        int inputYear=2020;
        String expected = "1/2/2020";
        String actual=NextDayCalculator.nextDay(inputDay,inputMonth,inputYear);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("30/4/2018 - 1/5/2018")
    void nextDay30_4_2018() {
        int inputDay=30;
        int inputMonth=4;
        int inputYear=2018;
        String expected = "1/5/2018";
        String actual=NextDayCalculator.nextDay(inputDay,inputMonth,inputYear);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("28/2/2018 - 1/3/2018")
    void nextDay28_2_2018() {
        int inputDay=28;
        int inputMonth=2;
        int inputYear=2018;
        String expected = "1/3/2018";
        String actual=NextDayCalculator.nextDay(inputDay,inputMonth,inputYear);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("29/2/2020 - 1/3/2020")
    void nextDay29_2_2018() {
        int inputDay=29;
        int inputMonth=2;
        int inputYear=2018;
        String expected = "1/3/2018";
        String actual=NextDayCalculator.nextDay(inputDay,inputMonth,inputYear);
        assertEquals(expected,actual);
    }

}