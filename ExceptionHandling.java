import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = sc.nextInt();// 10
        int b = sc.nextInt();// 0

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception " + e.getMessage());
        } catch (NumberFormatException e2) {
            System.out.println("Number Format Exception " + e2.getMessage());
        } finally {
            System.out.println("Finally Block");
        }
    }
}
