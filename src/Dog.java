public class Dog {
    int size;

    public void bark(int times) {
        if (size > 60) {
            bark(times, "Woof!");
        } else if (size > 14) {
            bark(times, "Ruff!");
        } else {
            bark(times, "Yip!");
        }
    }

    private void bark(int times, String sound) {
        for (int i=0; i<times; i++) {
            System.out.println("Woof!");
        }
    }
}
