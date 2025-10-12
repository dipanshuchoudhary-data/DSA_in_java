package Arrays_problem;

// Brute force

// public class Remove_duplicates {

//     void remover(int[] arr){
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : arr){
//             set.add(num);
//         }
//         System.out.println("Array after removing : "+ set);
//     }

//     public static void main(String[] args) {
//         Remove_duplicates checker = new Remove_duplicates();
        
//         int[] arr = {2,2,4,6,8,10};
//         checker.remover(arr);
        
//     }
// }


// 2. Two pointer 


public class Remove_duplicates {

    int remover(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!= arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
        

    public static void main(String[] args) {
        Remove_duplicates checker = new Remove_duplicates();
        
        int[] arr = {2,2,4,6,8,10};
        int length = checker.remover(arr);
        System.out.println("Unique elements : ");
        for(int k = 0;k<length;k++){
            System.out.println(arr[k]+" ");
        }
        
         
    }
}


