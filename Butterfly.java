public class Butterfly {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 6 - i - 1; j++) {
                    System.out.print("  ");

                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }

        }
        for (int i = 6; i > 0; i--) {

            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 6 - i - 1; j++) {
                    System.out.print("  ");

                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}
