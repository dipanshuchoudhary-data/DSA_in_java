public class eg2{

    public static void main(String[] args) {
        int[] array = {10,20,30,40};
        try { 
            int c = array[8];
            System.err.println(c);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index doesnt exist : "+e.getMessage());
            System.err.println(" ");

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally{
            for (int i=0;i<array.length;i++){
                System.err.println( i  + " = " + array[i]);
            }
        }
    }

}