import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 số");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println(number + " không phải là số nguyên tố");
        }else{
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
            if (number % 2 == 0) {
                check = false;
                break;
            }
            i++;
            }
            if (check){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
