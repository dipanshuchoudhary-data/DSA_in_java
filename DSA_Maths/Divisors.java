// Approach 1 ==> Time complexity -- O(n)
// Not good for big numbers


// public class Divisors {
//     public void printdiv(int n) {
//         for (int i = 1; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 System.out.println(i);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Divisors checker = new Divisors();
//         checker.printdiv(20);
//     }
// }



// Approach 2 ==> Time complexity -- O(sqrt.n)
// Better for interview prep.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {
    public void printdiv(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) { 
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Divisors checker = new Divisors();
        checker.printdiv(20);
    }
}




