import java.util.Scanner;

public class Picture { // Picture cu "for"
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Linii: ");
        int h = reader.nextInt();
        System.out.println("Coloane: ");
        int w = reader.nextInt();

        for (int k=0; k<w+2; k++) {
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i<h; i++) {
            System.out.print("#");
            for (int j = 0; j<w; j++ ) {
                System.out.print("0");
            }
            System.out.println("#");
        }
        for (int l =0; l<w+2; l++){
            System.out.print("#");
        }
    }
}
