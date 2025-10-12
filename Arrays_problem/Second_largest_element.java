package Arrays_problem;

public class Second_largest_element {

    public void element(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int max_int = Integer.MIN_VALUE;
        int second_element = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_int) {
                second_element = max_int;
                max_int = arr[i];
            } 
            else if (arr[i] < max_int && arr[i] > second_element) {
                second_element = arr[i];
            }
        }

        if (second_element == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest element found.");
        } else {
            System.out.println("Second largest element is: " + second_element);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 57, 356, 73, 28, 93, 28};

        Second_largest_element finder = new Second_largest_element();
        finder.element(arr);
    }
}
