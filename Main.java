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
        System.out.println(Algorithm.greatestPowerOfTwo(800));
        System.out.println(Algorithm.greatestPowerOfTwo(1024));
        System.out.println(Algorithm.greatestPowerOfTwo(3));
        //is the second string a substring
        System.out.println(Algorithm.isSubstring("Hello World", "World"));
        System.out.println(Algorithm.isSubstring("lorem ipsum", "Ipsum"));
        System.out.println(Algorithm.isSubstring("20", "2"));
        //reversing strings
        System.out.println(Algorithm.reverse("gohangasalami"));
        System.out.println(Algorithm.reverse("jiejfkdskfdkv"));
        System.out.println(Algorithm.reverse("23"));
        //check if palindrome
        System.out.println(Algorithm.isPalindrome("amanaplanacanalpanama"));
        System.out.println(Algorithm.isPalindrome("racecar"));
        System.out.println(Algorithm.isPalindrome("hello"));
        //number of times in string
        System.out.println(Algorithm.numberOfOccurences("Mississippi", "si"));
        System.out.println(Algorithm.numberOfOccurences("Hello world", "o"));
        System.out.println(Algorithm.numberOfOccurences("w", "why will we walk"));
        //printing an array of ints
        int[] intArray1 = {1, 2, 3};
        Algorithm.printArray(intArray1);
        Algorithm.printArray(new int[5]);
        Algorithm.printArray(new int[0]);
        //Swapping elements in array
        Algorithm.swapElements(intArray1, 0, 2);
        Algorithm.printArray(intArray1);
        int[] intArray2 = {1, 223, 432, 4, 3, 77};
        Algorithm.swapElements(intArray2, 3, 4);
        Algorithm.printArray(intArray2);
        Algorithm.swapElements(intArray2, 2, intArray2.length-1);
        Algorithm.printArray(intArray2);
        //Returning maximum of array
        int[] intArray3 = {0};
        System.out.println(Algorithm.max(intArray3));
        int[] intArray4 = {-4, -36, 4, 0};
        System.out.println(Algorithm.max(intArray4));
        int[] intArray5 = {8, 7, 6, 5, 4};
        System.out.println(Algorithm.max(intArray5));
        //Returning minimum of array
        System.out.println(Algorithm.min(intArray3));
        System.out.println(Algorithm.min(intArray4));
        System.out.println(Algorithm.min(intArray5));
        //Returning shortest String in array
        String[] stringArray1 = {"Hello,", "world", "!"};
        String[] stringArray2 = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetur"};
        String[] stringArray3 = {"supercalifragilisticexpialidocious", "antidisestablishmentarianism", "pneumonoultramicroscopicsilicovolcanoconiosis"};
        System.out.println(Algorithm.shortestString(stringArray1));
        System.out.println(Algorithm.shortestString(stringArray2));
        System.out.println(Algorithm.shortestString(stringArray3));
        //finding longest string
        System.out.println(Algorithm.longestString(stringArray1));
        System.out.println(Algorithm.longestString(stringArray2));
        System.out.println(Algorithm.longestString(stringArray3));

    }
}
