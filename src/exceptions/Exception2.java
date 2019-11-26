package exceptions;

public class Exception2 {
    public static void main(String[] args) {
        int y = 10;
        try { // Daca nu aveam try & catch aveam eroare (Tratarea Exceptiilor) facem tratarea
            int a = 1 /0;
            y = 5;
            System.out.println(a);
        } catch (Exception e) { // daca nu reusim sa o tratam o exceptam din cod
            System.out.println("Impartirea nu poate fi efectuata cu 0");
        }
        System.out.println(y);
    }
}
