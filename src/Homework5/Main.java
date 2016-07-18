package Homework5;

public class Main {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(20, -15, 44);
        ArrayUtils.printArray(array);

        System.out.println("Max: " + ArrayUtils.maximum(array));
        System.out.println("Min: " + ArrayUtils.minimum(array));

        System.out.println("Sorting...");
        ArrayUtils.sortArray(array);
        ArrayUtils.printArray(array);
    }
}
