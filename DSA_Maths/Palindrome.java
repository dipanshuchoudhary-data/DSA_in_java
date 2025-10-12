package DSA_Maths;

class Palindrome {
    public int reverse(int n){
        int rev_no = 0;
        int lg;
        while(n>0){
            lg = n % 10;
            n = n/10;
            rev_no = (rev_no *10) + lg ;
        } return rev_no;
    }

    public void check(int n){
        int rev_no = reverse(n);
        if (rev_no == n){
        System.out.println("It is a palindrome");
        } else {
            System.out.println("It is NOT a palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome sol2 = new Palindrome();
        sol2.check(345);
        sol2.check(121);

        
    }
}

