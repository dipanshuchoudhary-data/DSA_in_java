package DSA_Maths;
class Reverse_sol2 { 
    public int countdigit(int n) {
        if (n==0) return 1;
        return(int) Math.floor(Math.log10(Math.abs(n))) + 1;

    }
    public static void main(String[] args) {
        Reverse_sol2 sol = new Reverse_sol2();
        System.out.println(sol.countdigit(455));
        
    }

}
