import java.util.Random;

public class minMaxArray {
    public minMaxArray() {
    }

    public static void main(String[] args) {
        int[] a = new int[10];

        int max;
        for(max = 0; max < a.length; ++max) {
            Random rand = new Random();
            a[max] = rand.nextInt(1, 100);
            System.out.printf(a[max] + ",");
        }

        System.out.println("");
        max = a[0];
        int min = a[0];

        for(int i = 0; i < a.length; ++i) {
            if (max < a[i]) {
                max = a[i];
            }

            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
