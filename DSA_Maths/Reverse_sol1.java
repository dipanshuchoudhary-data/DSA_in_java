
class Reverse_sol1 {
    public int reverse(int n){
        int rev_no = 0;
        int lg;
        int sign = (n<0)? -1 : 1;
        n = Math.abs(n);
        while(n>0){
            lg = n % 10;
            n = n/10;
            rev_no = (rev_no *10) + lg ;
        } return rev_no * sign;
    }

    public static void main(String[] args) {
        Reverse_sol1 sol2 = new Reverse_sol1();
        System.out.println(sol2.reverse(-765));
        System.out.println(sol2.reverse(500));
        System.out.println(sol2.reverse(9898));
        
    }
}
