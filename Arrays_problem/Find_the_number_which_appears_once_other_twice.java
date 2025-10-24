package Arrays_problem;

public class Find_the_number_which_appears_once_other_twice {

    int looper(int[] arr){
        int xor = 0;
        for(int i=1;i<arr.length;i++){
            xor^=i;

        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        Find_the_number_which_appears_once_other_twice checker  = new Find_the_number_which_appears_once_other_twice();
        int ans = checker.looper(arr);
        System.out.println("Number : "+ ans);
    }
}
