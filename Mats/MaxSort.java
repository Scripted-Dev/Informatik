public class MaxSort {

    public static void main (String [] args) {

    int[] array = {8, 1, 53, 234, 4, 24442};

    for (int i = array.length - 1; i > 0; i--) {

        int maxIntIdx = 0;

        for (int j = 1; j <= i; j++) {

            if (array[maxIntIdx] < array[j]) {

                maxIntIdx = j;

            }

        }

        int temp = array[maxIntIdx];
        array[maxIntIdx] = array[i];
        array[i] = temp;

    }

    for (int x : array) {

        System.out.print(x + " ");

    }

    }

}