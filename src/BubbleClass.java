public class BubbleClass {
    public static void main(String args[]) {
        int[] collection = {20, 34, 7, -5, 14, 12, 6, 23, 8};
        for (int lastUnsortedIndex = collection.length -1; lastUnsortedIndex > 0;
               lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (collection[i] > collection[i+1] ) {
                    swap(collection, i , i+1);
                }
            }
        }
        for (int i = 0; i < collection.length; i++){
            System.out.print(collection[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
