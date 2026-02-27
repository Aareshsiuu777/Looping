public class Main {
    public static void main(String[] args) {


        int i = 0;
        while (i <= 24) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n");

        int j = 15;
        while (j >= 0) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println("\n");

        int k = 0;
        while (k <= 75) {
            System.out.print(k + " ");
            k += 5;
        }
        System.out.println("\n");

        int l = 18;
        while (l >= 0) {
            System.out.print(l + " ");
            l -= 2;
        }
        System.out.println("\n");



        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}