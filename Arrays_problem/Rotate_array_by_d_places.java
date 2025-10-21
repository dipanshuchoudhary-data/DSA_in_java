import java.util.Scanner;

public class Rotate_array_by_d_places {
    public void rotate(int[] arr,int d){
        d = d % arr.length;
        reverser(arr, 0,d-1);
        reverser(arr,d,arr.length-1);
        reverser(arr, 0, arr.length-1);

    }

    public void reverser(int[] arr,int st,int ed){
        while (st < ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }

    public int giv(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rotation number : ");
        int d = sc.nextInt();
        sc.close();
        return d;
    }

    public static void main(String[] args) {
        int[] arr = {20,30,40,50,60};
        Rotate_array_by_d_places fuel = new Rotate_array_by_d_places();
        
        int number = fuel.giv();
        fuel.rotate(arr, number);

        System.out.println("Array after rotation by "+ number +" places: ");
        for (int num:arr){
            System.out.print(num+ " ");
        }
        
    }
    
}
