public class Selection {
    public static void main(String args[]) {
        int a[] = { 3, 7, 9, 1, 2 };
        int min = 0;
        for (int i = 0; i <= a.length; i++) {
            min = i;
            for (int j = i + 1; j <= a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;

                }
                if (min != i) {
                    int temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
