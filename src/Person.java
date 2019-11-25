public class Person {
    private String name;
    private int age;
    private int height;
    private int stamina;

    public Person(String name, int age, int height, int stamina) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina--;
    }
    public void sleep() {
        stamina += 12;
    }

    public boolean isMajor() {
//        if (age >= 18) {
//            return true;
//        }
//        return false;
        /*return age >= 18 ? true : false;*/
        return this.age >= 18;
    }

    public int getAge() {
        return age;
    }
//    public String getName() {
//        return name + age;
//    }
}
