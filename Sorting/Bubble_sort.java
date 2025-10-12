import java.util.Arrays;

public class Bubble_sort {

    // public static void printarr(int arr[]){
    //     for(int a = 0;a<arr.length;a++){
    //         System.out.println(arr[a]);
    //     }
    // }

    public static void main(String[] args) {

        int arr[] = {92,56,45,83,29,73,10,14};

        for (int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        // printarr(arr);
        System.out.println("Sorted list : " + Arrays.toString(arr));
        
    }
    
}
