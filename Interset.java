import java.util.Scanner;

public class Interset {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interset_rate ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Money : ");
        money = sc.nextDouble();
        System.out.println("Month: ");
        month = sc.nextInt();
        System.out.println("Interset rate :");
        interset_rate = sc.nextDouble();

        double total_interset = 0 ;
        for (int i = 0 ; i < month ; i ++){
            total_interset += money * (interset_rate/100)/12 * month;
        }
        System.out.println("Total interset: " + total_interset);
    }
}
