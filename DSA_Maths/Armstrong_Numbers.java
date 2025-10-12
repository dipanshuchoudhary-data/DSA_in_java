package DSA_Maths;

public class Armstrong_Numbers {
    public boolean checkarm(int n){
        int sum = 0;
        int lg;
        int org = n;
        while(n>0){
            lg = n % 10;
            sum = sum + (lg*lg*lg);
            n = n/10;
        }
        return sum == org ;
    } 

    public static void main(String[] args) {
        Armstrong_Numbers checker = new Armstrong_Numbers();
        System.out.println(checker.checkarm(153));
        
    }
    
}
