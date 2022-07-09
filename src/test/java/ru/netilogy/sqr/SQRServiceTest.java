
package ru.netilogy.sqr;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shuldCalcExact() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shuldCalcUpTheRange() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(2, 80);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shuldCalcAfterTheRange() {
        SQRService service = new SQRService();
        int actual = service.calcSQR(9900, 15000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
