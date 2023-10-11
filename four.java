public class four {
    public static void main(String[] args) {

        // spaces pattern
        for (int i = 1; i <= 4; i++) {
            // this inner loop is for printing spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            // this inner loop for printing pattern
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= 5 - i + 1; j++) {
 * System.out.print(j);
 * }
 * System.out.println();
 * }
 * 
 */

// Floyd's traingle
/*
 * int num = 1;
 * for (int i = 1; i <= 5; i++) {
 * for (int j = 1; j <= i; j++) {
 * System.out.print(num + " ");
 * num++;
 * }
 * System.out.println();
 * }
 */