class Iteration {

    public static void printnum(int n){
        int [] arr = {2,4,6,8,10};
        int arr_len = arr.length;
        
        if (n>10)
            return;
        for (int i = 0; i < arr_len; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class Recursion {
    public static void main(String[] args) {
        Iteration.printnum(10);
    }
}
