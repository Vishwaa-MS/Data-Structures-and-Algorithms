import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int[] array1 = getArrays();
        System.out.println(Arrays.toString(array1));
        reverseCopy(array1);

    }
    public static int[] getArrays(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        String input = scanner.nextLine();

        String[] splits = input.split(","); // .splits returns as arrays of string ex: { "hi", "hello" }
        int[] values = new int[splits.length];
        for(int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim()); //trim cuts the spaces in the values if the user has entered.
        }
        return values;
    }

    public static void reverse(int[] array){
        int n = array.length;
        for(int i = 0; i < n/2; i++){
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
            System.out.println("--->" + Arrays.toString(array));
        }
    }

    public static void reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
//        for(int i = 0; i < array.length; i++){
//            reversedArray[maxIndex--] = array[i];
//        }
        for(int val : array){
            reversedArray[maxIndex--] = val;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
