package Arrays_problem;

public class Find_missing_element_in_array {
    public int number_sum(int n){
        return n*(n+1)/2;
    }

    public int array_sum(int[] arr){
        int sum_of_arr = 0;
        for(int i = 0;i<arr.length;i++){
            sum_of_arr +=arr[i];
        }
        return sum_of_arr;
    }

    public int calc_value(int n,int[] arr){
        int sum_of_n_number = number_sum(n);
        int sum_of_array = array_sum(arr);

        return sum_of_n_number - sum_of_array;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int n = 5;
        Find_missing_element_in_array checker = new Find_missing_element_in_array();
        int value = checker.calc_value(n, arr);
        System.out.println(value);
    }
}
