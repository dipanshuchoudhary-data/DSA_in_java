import java.util.Scanner;

public class eg1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        while (true) {
            try {

                System.out.println("Enter first number : ");
                int num1 = sc.nextInt();

                System.out.println("Enter second number : ");
                int num2 = sc.nextInt();
                int result  = num1 / num2;

                System.out.println("Result = " + result);

            } catch (ArithmeticException e) {
                System.err.println("Error found. Denominator can't be 0");
            }

            sc.nextLine();

            System.out.println("Type 'quit' to exit or press Enter to continue");
            String one = sc.nextLine();

            if (one.equals("quit")) {
                break;
            }
            
        }
    }
}