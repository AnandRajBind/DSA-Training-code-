import java.util.Scanner;

public class Exception_Handling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        String age = sc.next();

        // Number formate Exception
        try {
            int agee = Integer.parseInt(age);
            System.out.println("Your age is " + agee);
        } catch (Exception e1) {
            System.out.println("The input is invalid " + e1.getMessage());
        } 
    }
}
