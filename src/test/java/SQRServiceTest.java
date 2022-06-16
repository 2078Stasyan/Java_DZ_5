import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    void CalculateNumberOfSquares() {
        SQRService service = new SQRService();

        int min = 10;
        int max = 99;
        long expected = 6;
        long actual = service.calculate(min, max);
        System.out.println(actual);
        assertEquals(expected, actual);
    }

}
