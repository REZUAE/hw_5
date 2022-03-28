public class FillingArray {
    public FillingArray() {
    }

    public static void main(String[] args) {
        int[] a = new int[10];

        for(int i = 1; i <= a.length; ++i) {
            a[i - 1] = a.length - i;
        }

        int[] var6 = a;
        int var3 = a.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var6[var4];
            System.out.println("array~" + i + " = " + a[i]);
        }

    }
}
