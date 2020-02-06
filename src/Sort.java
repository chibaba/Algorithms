import java.util.Scanner;

public class Sort {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[]  args) {
        // create a programme using an array that sort a list of integers in descending orders
        //Descending order is highest to lowest
        //in other words if the array have values in it 106, 26, 51, 81, 5
        //ultimately should have an array with 106, 81, 51,26, 5
        //setup the program in the form the numbers to sort are read in from keyboard
        //implement the following methods - getIntegers, printArray, sortIntegers
        //grtIntegers returns an array of entered integers from keyboard
        //printArray prints out the content of the array
        //and sortIntegers should sort the array and return a new array containing the sorted numbers
        //you will have to figure out how to copy the array element from the passed array into a new
        //array and sort them and return the new sorted array.

        int [] myIntegers = getIntegers(5);
    }
    public static int[] getIntegers(int container){
        int[] array =new int[container];
        System.out.println("enter " + container + "integers values\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int [] array ) {
        for (int i = 0; i <array.length; i++) {
            System.out.print("Element " +i + "contents" + array[i]);
        }
    }
    public static int [] sortIntegers(int [] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
             sortedArray[i] =  array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
