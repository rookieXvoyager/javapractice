public class Selection {
    public static void swap(int a[], int b, int c) {
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }

    public static void main(String args[]) {
        int a[] = { 3, 7, 9, 1, 2 };
        int min = 0;// dec 
        for (int i = 0; i < a.length - 1; i++)// 
        {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;

                }

            }
            swap(a, min, i);

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
