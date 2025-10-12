// Most optimized solution for reverse a number problem .

class Reverse_sol3{
    public int reverse(int x){
        int rev = 0;
        while(x != 0){
            int lg = x % 10;
            x = x/10;

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && lg > 7))
            return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && lg <-8))
            return 0;

            rev = (rev*10) + lg;

        } return rev;
        
    }
    public static void main(String args[]) {
        Reverse_sol3 checker = new Reverse_sol3();
        System.out.println(checker.reverse(7011));   // Output: 1107
        System.out.println(checker.reverse(-123));   // Output: -321
        System.out.println(checker.reverse(1534236469)); // Output: 0 (overflow case)
    }
}


