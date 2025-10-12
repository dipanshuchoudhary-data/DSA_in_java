package Arrays_problem;

public class Check_sorted_array {

    void checker(int[] arr){
        boolean issorted = true;
        for(int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]){
                issorted = false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("Not sorted");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        Check_sorted_array lag =new Check_sorted_array();
        lag.checker(arr);
        
    }
    
}
