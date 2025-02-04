public class ArrayAndMethod {
    public static int[] fillArray(int size){
        int[] array= new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        }
        public static void main(String[] args) {
            int size= 10;
            int[] myArray = fillArray(size);
            System.out.print("The contents of the Array are: ");
            printArray(myArray);
        }
    }
