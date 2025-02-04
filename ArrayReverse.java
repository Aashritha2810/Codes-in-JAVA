public class ArrayReverse {
    //Method to reverse the elements of the array
    public static void reverse(int[] array){
        int start= 0;
        int end = array.length - 1;
        while(start < end){
            //Swap the elemnts at start and end
            int temp= array[start];
            array[start] = array[end];
            array[end] = temp;
            //Move start and end pointers
            start++;
            end--;
        }
    }
    //Method to print the contents of the array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        printArray(myArray);
        reverse(myArray);
        System.out.println("The reversed array is: ");
        printArray(myArray);

    }
}
