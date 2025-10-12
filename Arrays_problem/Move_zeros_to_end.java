package Arrays_problem;

public class Move_zeros_to_end {

    void director(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==0){
                arr[i] = arr[i+1];

            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr= {0,2,4,6,8};
        Move_zeros_to_end checker = new Move_zeros_to_end();
        checker.director(arr);
    }
    
}
