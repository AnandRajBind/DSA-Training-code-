import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the your Gender ");
        String Gender = sc.next();

        if ((age >= 18  && Gender.equals("female")) || (age >= 21  && Gender.equals("male")  )) {
            System.out.println("You Can to Marriage");
        } else   {
            System.out.println("You can not  Marriage");
        }


        
    }
}
