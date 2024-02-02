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
            if (str.substring(i, str.length()).equals(sub)) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] array){
        for (int element : array){
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
            if (element > max) max = element;
        }
        return max;
    }
}
