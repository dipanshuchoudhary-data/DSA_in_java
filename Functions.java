import java.util.Scanner;

public class Functions {


    public static int sum(int a,int b){
        return a+b;
    }

    public static float multiply(float a,float b){
        return a*b;
    }

    public static String uppercase(){

        System.out.println("Please enter name : ");
        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        return inputName.toUpperCase();
    }

    public static String lowercase(){

    System.out.println("Please write here : ");
    Scanner sc = new Scanner(System.in);
    String inputpara = sc.nextLine();

        return inputpara.toLowerCase();
    }

    public static float divide(float a,float b){
        return a/b;
    }

    public static int fact(int number ){
        int factorial = 1;
    for (int i = 1;i <=number;i++){
        factorial = factorial * i;  
    }
    return factorial;

    }

    public static void main(String[] args) {

        System.out.println(sum(7,10));
        System.out.println(multiply(548,649));
        System.out.println(divide(549464,76));
        System.out.println(uppercase());
        System.out.println(lowercase());


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial : ");
        int fact_num = sc.nextInt();
 
        int result = fact(fact_num);

        System.out.println("factorial of " + fact_num + " is " + result);
    }
}
