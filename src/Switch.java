public class Switch {
    public static void main(String[] args) {
        int dayOfWeek = 4;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
            case 5:
                System.out.println("Joi/Vineri");
                break;
            default:
                System.out.println("Nu Stiu");
        }
    }
}
