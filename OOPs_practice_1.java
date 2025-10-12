import java.util.Scanner;

class Student {

    String name;
    int rollnumber;
    double marks;

    public void info(String name,int rollnumber,double marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    public void info_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        this.name = sc.nextLine();
        System.out.println("Enter your rollnumber : ");
        this.rollnumber = sc.nextInt();
        System.out.println("Enter your marks : ");
        this.marks = sc.nextDouble();

        sc.nextLine();
    }

    public void info_display(){
        System.out.println("Name : " + name);
        System.out.println("Rollno. : "+rollnumber);
        System.out.println("Marks : "+marks);
    }
}

public class OOPs_practice_1 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
    
        // Student s1 = new Student();
        // s1.info("Dipanshu Choudhary", 41, 90);
        // s1.info_display();

        Student s2 = new Student();
        s2.info_input();
        s2.info_display();

        System.out.println("----Information saved---- ");
       

        sc.close();

    }
}
