package Arrays_problem;

public class Move_zeros_to_end {

    int var = 0;

    void director(int[] arr){
        for(int i=0;i<arr.length;i++){
            if (arr[i] != 0){
                arr[i]++;
            }

            if (arr[i] == 0){
                arr[i] 
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr= {0,2,4,6,8};
        Move_zeros_to_end checker = new Move_zeros_to_end();
        checker.director(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
    
}
