import java.time.LocalDateTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "PM" : "AM";

        System.out.println(ora + ":" + minute);
        System.out.println(perioada);

//        for(;;) {
//            Bucla infinita
//        }
        for (int i = 0; i<5; i++) {
            System.out.println(i);
        }
        System.out.println("Finish!");
        for (int j = 5; j>0; j--) {
            System.out.println(j);
        }
    }
}
