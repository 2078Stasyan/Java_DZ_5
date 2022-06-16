public class SQRService {
    public int calculate(int min, int max) {

        int sqr;
        int count = 0;

        for (int i = 0; i <= 10; i++) {
            sqr = i * i;
            if (sqr >= min && sqr <= max) {
                count++;
            }
        }
        return count;
    }
}