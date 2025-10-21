package Arrays_problem;

class Most_consv_ones {

    public int looper(int[] arr){
        int count = 0;
        int max_count = 0;

        for(int num:arr){
            if(num==1){
                count++;
                max_count = Math.max(max_count, count);
            }else{
                count = 0;
            }
        }
        return max_count;
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,1,1};
        Most_consv_ones checker = new Most_consv_ones();
        int value = checker.looper(arr);
        System.out.println("Number of most cons. ones = "+ value);
    } 
}
