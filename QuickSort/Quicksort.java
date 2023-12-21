package QuickSort;

public class Quicksort {
    private int[] array;
    private int length;

    public Quicksort(int[] array) {
        this.array = array;
        this.length = array.length;
    }

    public void sort() {
        this.quickSort(0, length - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivot = this.particiona(low, high);
            this.quickSort(low, pivot - 1);
            this.quickSort(pivot + 1, high);
        }
    }

    private int particiona(int low, int high) {
        int pivot = this.array[high];
        int pointer = low - 1;

        for (int i = low; i < high; i++) {
            if (this.array[i] <= pivot) {
                pointer++;
                this.troca(i, pointer);
            }
        }

        this.troca(pointer + 1, high);

        return pointer + 1;
    }

    private void troca(int i, int j) {
        int temp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = temp;
    }
}
