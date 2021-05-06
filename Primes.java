import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao số lượng cần in ra ");
        number = sc.nextInt();
        String Prime = "";
int count = 0;
int n = 2;
while (count < number){
    boolean result = true;
    for (int i = 2;i <n;i++){
        if (n % i == 0){
            result = false;
            break;
        }
    }if (result){
        count ++;
        Prime = Prime + n + " ";
    }
    n++;
}
        System.out.println(number + " so nguyen to la " + Prime);
    }
}
