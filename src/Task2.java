public class Task2 {
    public static void main(String[] args) {

        // Print the header for the table
        System.out.printf("%-10s %-10s %-10s%n", "Side 1", "Side 2", "Hypotenuse");

        // Triple-nested for loop to find all possible Pythagorean triples
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) { // Start side2 at 1 to include all permutations
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) { // Start hypotenuse at 1
                    // Check if the sides form a Pythagorean triple
                    if ((side1 * side1) + (side2 * side2) == hypotenuse * hypotenuse) {
                        // Print the Pythagorean triple
                        System.out.printf("%-10d %-10d %-10d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}