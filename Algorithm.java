public class Algorithm {
   public static int numberOfDigits(int n){
       if(n == 0){
           return 1;
       }
       return((int)(Math.log(Math.abs(n))/Math.log(10)+1));
   }


   public static boolean isDivisible(int a, int b){
       return b % a != 0;
   }
}
