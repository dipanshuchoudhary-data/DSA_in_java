
import java.util.Scanner;

class Car {
    int option;
    String color;
    String model;
    int year;
    String enginetype;
    int topspeed;

    public Car(int option,String color, String model, int year, String enginetype, int topspeed){
        this.color = color;
        this.option = option;
        this.model = model;
        this.year = year;
        this.enginetype = enginetype;
        this.topspeed = topspeed;
    }

    public void displaydetails(){
        System.out.println("Option : "+ option);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Year : "+ year);
        System.out.println("Engine_type : "+enginetype);
        System.out.println("TopSpeed : "+topspeed);
    }

    public String lowercase(Scanner sc){
        System.out.print("Enter Brand name : ");
        String brand  = sc.nextLine();
        return brand.toLowerCase();  
    }
} 

// Car subclasses
class Kia extends Car{
    public Kia(int option, String color, String model, int year, String enginetype, int topspeed){
        super(option, color, model, year, enginetype, topspeed);
    }
}

class Ford extends Car{
    public Ford(int option, String color, String model, int year, String enginetype, int topspeed){
        super(option, color, model, year, enginetype, topspeed);
    }
}

public class OOPs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car1 = new Ford(1, "Black", "Mustang", 2021, "Petrol", 200);
        Car car2 = new Ford(2, "Violet", "SUV", 2021, "Petrol", 200);
        Car car3 = new Ford(3, "Black", "Edge", 2021, "Petrol", 200);
        Car car4 = new Kia(1, "Blue", "Dzire", 2024, "Hybrid", 160);
        Car car5 = new Kia(2, "red", "Seltos", 2021, "Petrol", 200);
        Car car6 = new Kia(3, "Grey", "Telluride", 2021, "Petrol", 200 );

        String brand_name = car2.lowercase(sc);

        if(brand_name.equals("kia")){
            System.out.println("Option 1 details \n");
            car4.displaydetails();
            System.out.println("Option 2 details \n");
            car5.displaydetails();
            System.out.println("Option 3 details \n");
            car6.displaydetails();

        } else if (brand_name.equals("ford")){
            System.out.println("Option 1 details \n");
            car1.displaydetails();
            System.out.println("Option 2 details \n");
            car2.displaydetails();
            System.out.println("Option 3 details \n");
            car3.displaydetails();
        }else {
            System.out.println(" Brand not available!");
        }


        sc.close();
    }   
}
