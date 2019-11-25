public class Person {
    String name;
    int age;
    int height;
    int stamina;

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
        return age >= 18;
    }

    public int getAge() {
        return age;
    }
//    public String getName() {
//        return name + age;
//    }
}
