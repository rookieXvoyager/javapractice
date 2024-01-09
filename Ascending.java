
public class Ascending {
    public static void main(String args[]) {

        int a[] = { 5, 8, 3, 2, 1 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j + 1];// main logic, allot any no. to temp and replace it by the other, finally replace temp with the other var
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

    }
}