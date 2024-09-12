import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter the Value of num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.printf(" %d x %d = %d \n", num, i, num * i);
        }
    }
}
