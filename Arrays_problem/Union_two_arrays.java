import java.util.Arrays;

public class Union_two_arrays {
    public int[] merger(int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] array = new int[n1+n2];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            array[k++] = arr1[i];
        }
        for(int j = 0;j<arr2.length;j++){
            array[k++] = arr2[j];
        }
        return array;
    } 

    public void remover(int[] array){
        Arrays.sort(array);
        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }

        System.out.print("Union of two arrays : ");
        for(int x = 0;x <= i;x++){
            System.out.print(array[x]+" ");
        }
        System.out.println();
    } 

    public static void main(String[] args){
        Union_two_arrays checker = new Union_two_arrays();

        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {2, 3, 5, 6};
        
        int[] merged = checker.merger(arr1,arr2);
        checker.remover(merged);
    }
}
