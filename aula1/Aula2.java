package aula1;

public class Aula2 {
    public static void main(String[] args) {
        int[] array = {
                20, 18, 14, 37, 2, 14, 5, 3, 7
        };

        int fixValue = array[0];
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < fixValue) {
                fixValue = array[i];
                idx = i;
            }
        }

        System.out.println("O menor valor é " + fixValue + " e está na posição " + idx);
        int value = lowerValue(6, 3, array);

        if (value != -1) {
            System.out.println("O menor valor é " + value);
        } else {
            System.out.println("Erro!");
        }

    }

    static int lowerValue(int first, int stop, int[] array) {
        if (first < 0 || first >= array.length || stop < 0 || stop >= array.length || stop < first) {
            throw new IllegalArgumentException("Argumentos inválidos!");
        }
        int min = array[first];
        for (int i = first; i <= stop; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}