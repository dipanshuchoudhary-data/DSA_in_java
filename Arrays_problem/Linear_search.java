package Arrays_problem;

public class Linear_search {
    public static int checker(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {10,20,30,40,50,60,70,80,90};
        Linear_search finder = new Linear_search();
        System.out.print("Index of number in array : "+ finder.checker(arr,70));
    }
}
