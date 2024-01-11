public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
