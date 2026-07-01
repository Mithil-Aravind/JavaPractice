public class MultiplicationGrid {
    public static void main(String[] args) {
        // Outer loop for the rows (1 to 10)
        for (int i = 1; i <= 10; i++) {

            // Inner loop for the columns (1 to 10)
            for (int j = 1; j <= 10; j++) {
                // Print the product, followed by a tab character for spacing
                System.out.print((i * j) + "\t");
            }

            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}
