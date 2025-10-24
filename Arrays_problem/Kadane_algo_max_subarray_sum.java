// Type -1 ==> Only Positive

// Brute force approach

class Largest_subarray_sum{
    int typer(int[] arr,int k){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
    return count;
    }
    public static void main(String[] args) {
        int k = 16;
        int[] arr = {2,4,6,10};
        Largest_subarray_sum checker = new Largest_subarray_sum();

        System.out.println(checker.typer(arr,k));
    }
}