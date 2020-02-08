public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {1,-34, 5, 23, 12, 14, 22, 21, 87};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
        firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i -1] > newElement; i--) {
                intArray[i] = intArray[i -1];
            }
            intArray[i] = newElement;
        }


        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
