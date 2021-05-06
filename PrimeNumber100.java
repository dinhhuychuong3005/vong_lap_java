public class PrimeNumber100 {
    public static void main(String[] args) {
        String Prime = "";
        int n = 2;

        while (n < 100) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                Prime = Prime + n + " ";
            }
            n++;
        }
        System.out.println("cac so nguyen to nho hon 100 la: " + Prime);
    }
}
