package Arrays_problem;

public class Rotate_array_by_one_place {
    void rotater(int[] arr){
        
        int n = arr.length;
        int le = arr[0];
        for (int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
            
        }arr[n-1] = le;

    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        Rotate_array_by_one_place checker = new Rotate_array_by_one_place();

        checker.rotater(arr);

        System.out.print("Array after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
    
}
