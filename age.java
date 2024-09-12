import java.util.Scanner;

public class age {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
String Gender=sc.next();

        if(age >= 18){
            System.out.println("You can Vote");
        }
        else
        {
            System.out.println("You can not voting ");
        }
    }
}
