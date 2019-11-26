public class Program {
    public static void main(String[] args) {

        Person alex = new Person("Alexandru", 20, 175, 10);

        Person andrei = new Student("Andrei", 24, 180, 100, "A");
        andrei.grow(10);

        if (alex instanceof Student) {
            System.out.println(alex.getName() + " este persoana!");
        }

        Student s = (Student) andrei;
        System.out.println(((Student) andrei).getClassGroup());
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());

        System.out.println(alex.getName() + " are " + alex.getAge() + " de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());
        alex.sleep();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());

        if (alex.isMajor()) {
            System.out.println(alex.getName() + " drinks beer");
        }

        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark(2);
    }
}
