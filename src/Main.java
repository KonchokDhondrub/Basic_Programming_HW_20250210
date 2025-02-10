import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Duck("Egyptian goose", 70, 2, 145, 1200));
        flyables.add(new Aircraft("Boeing 777", 368, 15000));
        flyables.add(new Aerostat("Zeppelin NT D-LZZF", 12, 680));

        for (Flyable flyable : flyables) {
            System.out.println(flyable.fly());
        }
    }
}