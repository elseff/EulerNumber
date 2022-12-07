import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(EulerNumber.getNumber(1000));
        Instant finish = Instant.now();
        double elapsed = (double) Duration.between(start,finish).toMillis()/1000;
        System.out.printf("%.3f seconds", elapsed);
    }
}
