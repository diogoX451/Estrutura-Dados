
class Ordanation {

    public static void main(String[] args) {
        int[] num = { 22, 7, 8, 5, 444, 45, 4, 71, 25, 46, 16 };

        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;

            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j--;
            }

            num[j + 1] = key;

        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}