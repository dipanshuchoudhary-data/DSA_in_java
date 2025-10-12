package Arrays_problem;

public class Largest_element_in_array {

    public void element(int [] arr){
        int max_int = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]> max_int){
                max_int = arr[i];
            }
        }
        System.out.println(max_int);

    }

    public static void main(String[] args) {
        int [] arr = {10,57,356,73,28,93,28};
        int n = arr.length;

        Largest_element_in_array finder = new Largest_element_in_array();
        finder.element(arr);

    }

}
