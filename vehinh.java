import java.util.Scanner;

public class vehinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print the square triangle");
            System.out.println("4.Print isosceles triangle");
            System.out.println("5.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Print the square triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Print the square triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Print isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                }
            }
        }
    }
}
