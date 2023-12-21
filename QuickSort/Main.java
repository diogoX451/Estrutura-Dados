package QuickSort;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] { 5, 3, 8, 7, 8, 7, 1, 2, 4, 8, 11, 20, 30, 9 };

        Quicksort quicksort = new Quicksort(array);
        quicksort.sort();

        Student[] students = Student.loadStudents();

        // quickSort(array, 0, array.length - 1);

        // for (int i = 0; i < array.length; i++) {
        // System.out.print(array[i] + ", ");
        // }
        // }

        // public static void quickSort(int array[], int esquerda, int direita) {
        // if (esquerda < direita) {
        // int pivot = particiona(array, esquerda, direita);
        // quickSort(array, esquerda, pivot - 1);
        // quickSort(array, pivot + 1, direita);
        // }
        // }

        // public static int particiona(int[] array, int esquerda, int direita) {
        // int pivot = array[esquerda];
        // int pointer = esquerda;
        // for (int i = esquerda + 1; i <= direita; i++) {
        // if (array[i] <= pivot) {
        // pointer++;
        // troca(array, i, pointer);

        // }
        // }
        // troca(array, esquerda, pointer);

        // return pointer;
        // }

        // public static void troca(int[] array, int i, int j) {
        // int temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;
        // }
    }
}