public class ArraySwap {
    public static void swap(int[] array, int index1, int index2){
            int temp = array[index1];
            array[index1] = array [index2];
            array[index2] = temp;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] myArray= {1, 2, 3, 4, 5,};
        System.out.println("Original array; ");
        printArray(myArray);
        swap(myArray, 0, 2);
        System.out.println("Array after swapping elements at index 1 and 3: ");
        printArray(myArray);
    }
}
