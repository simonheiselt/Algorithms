import java.util.ArrayList;
import java.util.Arrays;
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
        //finding largest difference
        int[] intArray6 = {2, 3, 4};
        int[] intArray7 = {-1, -2, -3};
        int[] intArray8 = {0, 123};
        System.out.println(Algorithm.largestDifference(intArray6, intArray7));
        System.out.println(Algorithm.largestDifference(intArray6, intArray8));
        System.out.println(Algorithm.largestDifference(intArray8, intArray7));
        //averaging
        System.out.println(Algorithm.average(new double[4]));
        double[] doubleArray1 = {2.0, 3.0, 4.0, 5.0};
        System.out.println(Algorithm.average(doubleArray1));
        double[] doubleArray2 = {2.0, 3.0, 4.0, 5234.0};
        System.out.println(Algorithm.average(doubleArray2));
        //reversing
        Algorithm.printArray(intArray1);
        Algorithm.printArray(intArray2);
        Algorithm.printArray(intArray3);
        Algorithm.printArray(Algorithm.reverse(intArray1));
        Algorithm.printArray(Algorithm.reverse(intArray2));
        Algorithm.printArray(Algorithm.reverse(intArray3));

        int[] intArray9 = {1, 2, 3, 3, 4};
        System.out.println(Algorithm.hasConsecutiveDuplicate(intArray9));
        System.out.println(Algorithm.hasConsecutiveDuplicate(intArray1));
        System.out.println(Algorithm.hasConsecutiveDuplicate(intArray3));
        int[] intArray10 = {1, 0, -1};
        System.out.println(Algorithm.firstNegative(intArray10));
        System.out.println(Algorithm.firstNegative(intArray9));
        System.out.println(Algorithm.firstNegative(intArray7));
        int[] array11 = {1, 2, 3, 2};
        System.out.println(Algorithm.hasDuplicates(array11));
        System.out.println(Algorithm.hasDuplicates(intArray9));
        System.out.println(Algorithm.hasDuplicates(intArray1));
        int[] array12 = {1, 2, 1, 1, 1};
        System.out.println(Algorithm.longestStreak(array12, 1));
        System.out.println(Algorithm.longestStreak(intArray9, 3));
        System.out.println(Algorithm.longestStreak(intArray3, 2));
        String[] stringArray4 = {"zebra", "alpha"};
        System.out.println(Algorithm.lastAlphabetically(stringArray4));
        System.out.println(Algorithm.lastAlphabetically(stringArray2));
        System.out.println(Algorithm.lastAlphabetically(stringArray4));
        int[] intArray13 = {1, 2};
        int[] intArray14 = {3, 4};
        System.out.println(Algorithm.hasIdenticalValues(intArray13, intArray14));
        System.out.println(Algorithm.hasIdenticalValues(intArray9, intArray1));
        System.out.println(Algorithm.hasIdenticalValues(intArray3, intArray7));
        //7.4
        ArrayList<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(-1, 0, 1));
        ArrayList<Integer> intList2 = new ArrayList<Integer>(Arrays.asList(-1, -2, -3));
        ArrayList<Integer> intList3 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> intList6 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3));
        System.out.println(Algorithm.removeDuplicates(intList6));
        System.out.println(Algorithm.removeDuplicates(intList1));
        System.out.println(Algorithm.removeDuplicates(intList3));

        intList6 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3));
        System.out.println(Algorithm.removeNum(intList6, 2));
        System.out.println(Algorithm.removeNum(intList1, -1));
        System.out.println(Algorithm.removeNum(intList3, 0));

        intList6 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3));
        System.out.println(Algorithm.addInOrder(intList6, 4));
        ArrayList<Integer> intList7 = new ArrayList<Integer>(Arrays.asList(0, 4, 5, 6));
        System.out.println(Algorithm.addInOrder(intList7, 3));
        System.out.println(Algorithm.addInOrder(intList7, 7));

        ArrayList<Integer> intList8 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> intList9 = new ArrayList<Integer>(Arrays.asList(3, 2, 1));
        System.out.println(Algorithm.areArraysInReverseOrder(intList8, intList9));
        System.out.println(Algorithm.areArraysInReverseOrder(intList3, intList3));
        System.out.println(Algorithm.areArraysInReverseOrder(intList8, intList8));

        System.out.println(Algorithm.max(intList9));
        System.out.println(Algorithm.max(intList7));
        System.out.println(Algorithm.max(intList8));

        System.out.println(Algorithm.min(intList9));
        System.out.println(Algorithm.min(intList7));
        System.out.println(Algorithm.min(intList8));

        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("Hello,", "world", "!"));
        ArrayList<String> stringList4 = new ArrayList<String>(Arrays.asList("", "asldkfjdlkjf", "!"));
        ArrayList<String> stringList5 = new ArrayList<String>(Arrays.asList("ajdlk,", "are", "sdfdsafdsafdasfdsfd"));
        System.out.println(Algorithm.shortestString(stringList3));
        System.out.println(Algorithm.shortestString(stringList4));
        System.out.println(Algorithm.shortestString(stringList5));
        System.out.println(Algorithm.longestString(stringList3));
        System.out.println(Algorithm.longestString(stringList4));
        System.out.println(Algorithm.longestString(stringList5));

        ArrayList<Integer> intList10 = new ArrayList<Integer>(Arrays.asList(2, 3, 4));
        ArrayList<Integer> intList11 = new ArrayList<Integer>(Arrays.asList(-1, -2, -3));
        System.out.println(Algorithm.largestAbsoluteDifference(intList10, intList11));
        System.out.println(Algorithm.largestAbsoluteDifference(intList6, intList11));
        System.out.println(Algorithm.largestAbsoluteDifference(intList1, intList11));

        ArrayList<Double> doubleList1 = new ArrayList<Double>(Arrays.asList(1.5, 3.5, 5.5));
        ArrayList<Double> doubleList2 = new ArrayList<Double>(Arrays.asList(-1000.0, 3.5, 5.5));
        ArrayList<Double> doubleList3 = new ArrayList<Double>(Arrays.asList(1.5, 30.6, 5.5));
        System.out.println(Algorithm.calculateMean(doubleList1));
        System.out.println(Algorithm.calculateMean(doubleList2));
        System.out.println(Algorithm.calculateMean(doubleList3));

        System.out.println(Algorithm.reverseList(intList8));
        System.out.println(Algorithm.reverseList(intList9));
        System.out.println(Algorithm.reverseList(intList10));

        ArrayList<Integer> intList12 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 4));
        System.out.println(Algorithm.hasConsecutiveDuplicate(intList12));
        System.out.println(Algorithm.hasConsecutiveDuplicate(intList1));
        System.out.println(Algorithm.hasConsecutiveDuplicate(intList3));

        ArrayList<Integer> intList13 = new ArrayList<Integer>(Arrays.asList(1, 0, -1));
        System.out.println(Algorithm.firstNegative(intList13));
        System.out.println(Algorithm.firstNegative(intList12));
        System.out.println(Algorithm.firstNegative(intList11));

        ArrayList<Integer> intList14 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2));
        System.out.println(Algorithm.hasDuplicateValues(intList14));
        System.out.println(Algorithm.hasDuplicateValues(intList12));
        System.out.println(Algorithm.hasDuplicateValues(intList13));

        //7.5
        System.out.println(Algorithm.numOfNegativeValues(intList1));
        System.out.println(Algorithm.numOfNegativeValues(intList2));
        System.out.println(Algorithm.numOfNegativeValues(intList3));
        ArrayList<String> stringList1 = new ArrayList<String>(Arrays.asList("String"));
        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("String", "string"));
        System.out.println(Algorithm.isInArray(stringList1, "string"));
        System.out.println(Algorithm.isInArray(stringList1, "String"));
        System.out.println(Algorithm.isInArray(stringList2, "string"));
        ArrayList<Integer> intList4 = new ArrayList<Integer>(Arrays.asList(1, 2));
        ArrayList<Integer> intList5 = new ArrayList<Integer>(Arrays.asList(2, 3));
        System.out.println(Algorithm.hasIdenticalValues(intList4, intList5));
        System.out.println(Algorithm.hasIdenticalValues(intList2, intList3));
        System.out.println(Algorithm.hasIdenticalValues(intList1, intList2));

        //7.6
        String[] stringArray5 = {"zebra", "alpha"};
        String[] stringArray6 = {"asdfdsg", "Gfdsgf", "b"};
        String[] stringArray7 = {"fsd", "45", "@#$%^^#"};
        Algorithm.printArray(Algorithm.alphabeticSelectionSort(stringArray5));
        Algorithm.printArray(Algorithm.alphabeticSelectionSort(stringArray6));
        Algorithm.printArray(Algorithm.alphabeticSelectionSort(stringArray7));
        String[] stringArray8 = {"zebra", "alpha"};
        String[] stringArray9 = {"a", "v", "d", "i", "k", "s", "Z", "w"};
        String[] stringArray10 = {"asdfj", "asdf", "asdfb"};
        Algorithm.printArray(Algorithm.alphabeticInsertionSort(stringArray8));
        Algorithm.printArray(Algorithm.alphabeticInsertionSort(stringArray9));
        Algorithm.printArray(Algorithm.alphabeticInsertionSort(stringArray10));
        ArrayList<String> stringList6 = new ArrayList<String>(Arrays.asList("zebra", "alpha"));
        ArrayList<String> stringList7 = new ArrayList<String>(Arrays.asList("String", "strinf"));
        ArrayList<String> stringList8 = new ArrayList<String>(Arrays.asList("fds", "dng h", "  x", "vvvvvvvvvv"));
        System.out.println(Algorithm.alphabeticSelectionSort(stringList6));
        System.out.println(Algorithm.alphabeticSelectionSort(stringList7));
        System.out.println(Algorithm.alphabeticSelectionSort(stringList8));
        ArrayList<String> stringList9 = new ArrayList<String>(Arrays.asList("zebra", "alpha"));
        ArrayList<String> stringList10 = new ArrayList<String>(Arrays.asList("String", "strinf"));
        ArrayList<String> stringList11 = new ArrayList<String>(Arrays.asList("fds", "dng h", "  x", "vvvvvvvvvv"));
        System.out.println(Algorithm.alphabeticInsertionSort(stringList9));
        System.out.println(Algorithm.alphabeticInsertionSort(stringList10));
        System.out.println(Algorithm.alphabeticInsertionSort(stringList11));
        ArrayList<Integer> intList15 = new ArrayList<Integer>(Arrays.asList(1, 0, -1));
        ArrayList<Integer> intList16 = new ArrayList<Integer>(Arrays.asList(5, 8, 2, 4, 3, 2, 1, 6 ,9, 0, 5));
        ArrayList<Integer> intList17 = new ArrayList<Integer>(Arrays.asList(7, 6, 5, 4, 3, 2, 8));
        System.out.println(Algorithm.selectionSort(intList15));
        System.out.println(Algorithm.selectionSort(intList16));
        System.out.println(Algorithm.selectionSort(intList17));
        ArrayList<Integer> intList18 = new ArrayList<Integer>(Arrays.asList(1, 0, -1));
        ArrayList<Integer> intList19 = new ArrayList<Integer>(Arrays.asList(5, 8, 2, 4, 3, 2, 1, 6 ,9, 0, 5));
        ArrayList<Integer> intList20 = new ArrayList<Integer>(Arrays.asList(7, 6, 5, 4, 3, 2, 8));
        System.out.println(Algorithm.insertionSort(intList18));
        System.out.println(Algorithm.insertionSort(intList19));
        System.out.println(Algorithm.insertionSort(intList20));

        //8.2
        System.out.println(Algorithm.countElementsContainingString(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}}, "e"));
        System.out.println(Algorithm.countElementsContainingString(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}}, "Gen"));
        System.out.println(Algorithm.countElementsContainingString(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}}, "hello"));

        System.out.println(Algorithm.isIntIn2DArray(new int[][]{{1, 2},{3, 4}}, 5));
        System.out.println(Algorithm.isIntIn2DArray(new int[][]{{1, 2},{3, 4}}, 3));
        System.out.println(Algorithm.isIntIn2DArray(new int[][]{{1, 2},{2, 2}}, 2));

        Algorithm.printArray(Algorithm.findIntIn2DArray(new int[][]{{1, 2},{3, 4}}, 3));
        Algorithm.printArray(Algorithm.findIntIn2DArray(new int[][]{{1, 2},{3, 4}}, 5));
        Algorithm.printArray(Algorithm.findIntIn2DArray(new int[][]{{1, 1},{3, 4}}, 1));

        Algorithm.printArray(Algorithm.getDiagonalElements(new int[][]{{1, 2},{3, 4}}));
        Algorithm.printArray(Algorithm.getDiagonalElements(new int[][]{{1, 2, 3},{3, 4, 36}}));
        Algorithm.printArray(Algorithm.getDiagonalElements(new int[][]{{0}}));

        System.out.println(Algorithm.concatenateColumnStrings(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}, 1));
        System.out.println(Algorithm.concatenateColumnStrings(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}, 2));
        System.out.println(Algorithm.concatenateColumnStrings(new String[][]{{" "}, {"It's", "me", "Margaret"}}, 0));

        System.out.println(Algorithm.maxIn2DArray(new int[][]{{3, 2, 1}, {4, 5, 6}}));
        System.out.println(Algorithm.maxIn2DArray(new int[][]{{3, 2, 1}, {4, 5, 8}}));
        System.out.println(Algorithm.maxIn2DArray(new int[][]{{-500}}));

        System.out.println(Algorithm.minIn2DArray(new int[][]{{3, 2, 1}, {4, 5, 6}}));
        System.out.println(Algorithm.minIn2DArray(new int[][]{{3, 2, -5}, {4, 5, 6}}));
        System.out.println(Algorithm.minIn2DArray(new int[][]{{300, 2, 1}, {4, 5, 6}}));

        System.out.println(Algorithm.shortestStringIn2DArray(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(Algorithm.shortestStringIn2DArray(new String[][]{{"Hello,", "world", "!!!"}, {"It", "me", "Margaret"}}));
        System.out.println(Algorithm.shortestStringIn2DArray(new String[][]{{"Hello", "world", "!!!!!"}, {"Itt's", "meeee", "Margo"}}));

        System.out.println(Algorithm.longestStringIn2DArray(new String[][]{{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}}));
        System.out.println(Algorithm.longestStringIn2DArray(new String[][]{{"Helloooo,", "world", "!!!"}, {"It", "me", "Margaret"}}));
        System.out.println(Algorithm.longestStringIn2DArray(new String[][]{{"Hello", "world", "!!!!!"}, {"Itt's", "meeee", "Margo"}}));

        System.out.println(Algorithm.largestAbsoluteDifferenceBetween2DArrays(new int[][]{{2, 3, 4}, {-1, -2, -3}}, new int[][]{{1, 2, 3}, {4, 5, 6}}));
        System.out.println(Algorithm.largestAbsoluteDifferenceBetween2DArrays(new int[][]{{2, 3, 4}, {-5, -2, -3}}, new int[][]{{1, 2, 3}, {4, 5, 6}}));
        System.out.println(Algorithm.largestAbsoluteDifferenceBetween2DArrays(new int[][]{{333, 3, 4}, {-1, -2, -3}}, new int[][]{{1, 2, 3}, {4, 5, 6}}));

        System.out.println(Algorithm.calculateMean2DArray(new double[][]{{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}}));
        System.out.println(Algorithm.calculateMean2DArray(new double[][]{{3.0}}));
        System.out.println(Algorithm.calculateMean2DArray(new double[][]{{1.6, 3.2, 5.4}, {6.3, 44444444.1, 2.5}}));

        System.out.println(Algorithm.hasIdenticalValuesIn2DArray(new int[][]{{1, 2}, {3, 2}}));
        System.out.println(Algorithm.hasIdenticalValuesIn2DArray(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(Algorithm.hasIdenticalValuesIn2DArray(new int[][]{{1, 1}, {3, 2}}));

        System.out.println(Algorithm.lastAlphabetically(new String[][]{{"bravo", "charlie"}, {"zebra", "alpha"}}));
        System.out.println(Algorithm.lastAlphabetically(new String[][]{{"bravo", "charlie"}, {"!%$!%!@", "alpha"}}));
        System.out.println(Algorithm.lastAlphabetically(new String[][]{{"bravo", "5233235"}, {"zebra", "!$#$^&&^%"}}));
    }
}
