package DSA_Maths;

class countDigit {
    public int countdig(int n) {
        int cal=0;
        while (n>0){
            cal= cal + 1;
            n=n/10;
        }
    return cal;
    }

    public static void main(String[] args){
    countDigit sol = new countDigit();
    System.out.println(sol.countdig(543));

    }
}

