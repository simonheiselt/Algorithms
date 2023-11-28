public class Main {
    public static void main(String[] args){
        //Number of digits
        System.out.println(Algorithm.numberOfDigits(12345688));
        System.out.println(Algorithm.numberOfDigits(-333));
        System.out.println(Algorithm.numberOfDigits(0));
        //divisibility
        System.out.println(Algorithm.isDivisible(3, 9));
        System.out.println(Algorithm.isDivisible(9, 3));
        System.out.println(Algorithm.isDivisible(5, 8));
        //sum of odd numbers between parameters
        System.out.println(Algorithm.sumOfOdd(4, 9));
        System.out.println(Algorithm.sumOfOdd(3, 5));
        System.out.println(Algorithm.sumOfOdd(12, 4));
        System.out.println(Algorithm.sumOfOdd(15, 22));
        //sum of multiples of ten between parameters
        System.out.println(Algorithm.sumOfMultiplesOfTen(10, 99));
        System.out.println(Algorithm.sumOfMultiplesOfTen(1, 20));
        System.out.println(Algorithm.sumOfMultiplesOfTen(34, 39));
        //sum of digits of parameter
        System.out.println(Algorithm.sumOfDigits(321));
        System.out.println(Algorithm.sumOfDigits(10000000));
        System.out.println(Algorithm.sumOfDigits(99999));
        //largest power of two less than parameter
        System.out.println(Algorithm.greatestPowerOfTwo(800);
        System.out.println(Algorithm.greatestPowerOfTwo(1024);
        System.out.println(Algorithm.greatestPowerOfTwo(3);
    }
}
