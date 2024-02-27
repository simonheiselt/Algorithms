import java.util.ArrayList;

public class Algorithm {
    public static int numberOfDigits(int n){
        if(n == 0){
            return 1;
        }
        return((int)(Math.log(Math.abs(n))/Math.log(10)+1));
    }

    public static boolean isDivisible(int a, int b){
        return a % b == 0;
    }

    public static int sumOfOdd(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOfMultiplesOfTen(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(i % 10 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int greatestPowerOfTwo(int n){
        int power = (int)(Math.log(n)/Math.log(2));
        return (int)(Math.pow(2, power));
    }

    public static boolean isSubstring(String str, String sub){
        for (int i = 0; i < sub.length(); i ++) {
            if (str.substring(i).equals(sub)) {
                return true;
            }
        }
        return false;
    }

    public static String reverse(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i ++){
            newStr = str.substring(i, i+1) + newStr;
        }
        return newStr;
    }

    public static boolean isPalindrome(String str){
        if(str.equals(reverse(str))) return true;
        return false;
    }

    public static int numberOfOccurences(String phrase, String sub){
        int count = 0;
        for(int i = 0; i <= phrase.length() - sub.length(); i ++){
            if(phrase.substring(i, i + sub.length()).equals(sub)) count ++;
        }
        return count;
    }

    public static void printArray(int[] array){
        for (int element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array){
        for (String element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void swapElements(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /* Precondition: array has at least one element */
    public static int max(int[] array){
        int max = array[0];
        for (int element : array){
            if (element > max) max = element;
        }
        return max;
    }

    public static int min(int[] array){
        int min = array[0];
        for (int element : array){
            if (element < min) min = element;
        }
        return min;
    }

    public static String shortestString(String[] array){
        String shortest = array[0];
        for (String element : array){
            if (element.length() < shortest.length()) shortest = element;
        }
        return shortest;
    }

    public static String longestString(String[] array){
        String longest = array[0];
        for (String element : array){
            if (element.length() > longest.length()) longest = element;
        }
        return longest;
    }

    public static int largestDifference(int[] array1, int[] array2){
        int size = 0;
        if(array1.length > array2.length) size = array2.length;
        else size = array1.length;
        int difference = 0;
        for (int i = 0; i < size; i ++){
            if (Math.abs(array1[i]-array2[i]) > difference){
                difference = Math.abs(array1[i]-array2[i]);
            }
        }
        return difference;
    }

    public static double average(double[] array){
        double sum = 0;
        for (double element : array) sum += element;
        sum /= array.length;
        return sum;
    }

    public static int[] reverse(int[] array){
        for(int i = 0; i < array.length/2; i ++){
            swapElements(array, i, array.length-i-1);
        }
        return array;
    }

    public static boolean hasConsecutiveDuplicate(int[] array){
        for(int i = 0; i < array.length-1; i ++){
            if (array[i] == array[i+1]) return true;
        }
        return false;
    }

    public static int firstNegative(int[] array){
        for(int i = 0; i < array.length; i ++){
            if(array[i] < 0) return i;
        }
        return -1;
    }

    public static boolean hasDuplicates(int[] array){
        for(int i = 0; i < array.length; i ++){
            for(int j = i+1; j < array.length; j ++){
                if(array[i] == array[j]) return true;
            }
        }
        return false;
    }

    public static int longestStreak(int[] array, int num){
        int maxStreak = 0;
        int currentStreak = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            }
            else{
                currentStreak = 0;
            }
        }
        return maxStreak;
    }

    public static String lastAlphabetically(String[] array){
        String last = array[0];
        for (String str : array){
            if (str.compareTo(last) > 0){
                last = str;
            }
        }
        return last;
    }

    public static boolean hasIdenticalValues(int[] array1, int[] array2){
        for (int i : array1){
            for (int j : array2){
                if (i == j){
                    return true;
                }
            }
        }
        return false;
    }
    

    //7.4
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        for(int i = list.size() - 1; i > 0; i--){
            if(list.get(i) == list.get(i-1)){
                list.remove(i);
            }
        }
        return list;
    }

    public static ArrayList<Integer> removeNum(ArrayList<Integer> list, int num){
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.get(i) == num){
                list.remove(i);
            }
        }
        return list;
    }

    public static ArrayList<Integer> addInOrder(ArrayList<Integer> list, int num){
        int index = 0;
        for(int i = 0; i < list.size(); i++){
            if(num < list.get(i)){
                list.add(index, num);
                break;
            }
        }
        return list;
    }

    public static boolean areArraysInReverseOrder(ArrayList<Integer> list1, ArrayList<Integer> list2){
        if(list1.size() != list2.size()){
            return false;
        }
        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) != list2.get(list2.size()-1-i)){
                return false;
            }
        }
        return true;
    }
    
    public static int max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int num : list){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static String shortestString(ArrayList<String> list){
        String shortest = list.get(0);
        for (String str : list){
            if (str.length() < shortest.length()) shortest = str;
        }
        return shortest;
    }
    
    public static String longestString(ArrayList<String> list){
        String longest = list.get(0);
        for (String str : list){
            if (str.length() > longest.length()) longest = str;
        }
        return longest;
    }
    
    public static int largestAbsoluteDifference(ArrayList<Integer> list1, ArrayList<Integer> list2){
        int maxDifference = 0;
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            int difference = Math.abs(list1.get(i) - list2.get(i));
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        return maxDifference;
    }

    public static double calculateMean(ArrayList<Double> list) {
        if(list.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for(double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
    
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list){
        for(int i = 0; i < list.size()/2; i++){
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
        return list;
    }
    
    public static boolean hasConsecutiveDuplicate(ArrayList<Integer> list){
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) == list.get(i+1)){
                return true;
            }
        }
        return false;
    }

    public static int firstNegative(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 0){
                return i;
            }
        }
        return -1;
    }

    public static boolean hasDuplicateValues(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) == list.get(j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    //7.5
    public static int numOfNegativeValues(ArrayList<Integer> list){
        int count = 0;
        for(int i : list){
            if (i < 0) count++;
        }
        return count;
    }

    public static boolean isInArray(ArrayList<String> list, String str){
        for(String s : list) if(s.equals(str)) return true;
        return false;
    }

    public static boolean hasIdenticalValues(ArrayList<Integer> list1, ArrayList<Integer> list2){
        for(int i : list1) for(int j : list2) if(i == j) return true;
        return false;
    }

    //7.6
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String[] alphabeticSelectionSort(String[] array){
        int mindex = 0;
        for(int i = 0; i < array.length; i ++){
            for(int j = i+1; j < array.length; j++){
                if (array[j].toLowerCase().compareTo(array[mindex].toLowerCase()) > 0) {
                    mindex = j;
                }
            }
            if(mindex!=i){
                swap(array, i, mindex);
            }
        }
        return array;
    }

}
