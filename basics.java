import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("ENter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Tell your Gender (boy or girl): ");
        String gender = sc.nextLine();

        System.out.println("Hello "+ name + ",");
        System.out.println("Nice to meet you "+ age + " " + gender); 
        */
        
        char a = 'A';
        char b = 'M';
        System.out.println(a + 0);
        System.out.println(b + 0);

        boolean c = a==b;
        System.out.print(c);
        sc.close();
    }
}

