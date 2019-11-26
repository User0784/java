package planets;

import java.util.Scanner;
import static planets.Planet.EARTH;
public class Program {
    public static void main(String[] args) {
        System.out.println("What is your heigh on Earth?");
        Scanner keyboard = new Scanner(System.in);
        double earthWeight / EARTH.surfaceGravity();
        double mass = earthWeight / EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.println("Your weight on " + p + "is" + p.surfaceWeight(mass));
        }
    }
}
