public class Numberpyramid {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
            k++;
        }
    }
}
