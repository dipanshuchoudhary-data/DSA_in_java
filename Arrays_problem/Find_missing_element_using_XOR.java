package Arrays_problem;

public class Find_missing_element_using_XOR {
    public int findmissing(int[] arr,int n ){
        int xor1 = 0;
        int xor2 = 0;

        for(int i = 1;i<=n;i++){
            xor1^=i;
        }

        for(int num:arr){
            xor2^=num;
        }

        return xor1^xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;
        Find_missing_element_using_XOR checker = new Find_missing_element_using_XOR();
        int value = checker.findmissing(arr,n);
        System.out.println("Missing value : "+ value);
    }
}
