import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the current population and growth rate
        System.out.println("Welcome to the world population calculator");
        System.out.print("Enter the current world population: ");
        double currentPopulation = input.nextDouble();

        System.out.print("Enter the current growth rate (e.g., 0.0114 for 1.14%): ");
        double growthRate = input.nextDouble();

        // Print table header
        System.out.printf("%-5s %-20s %-20s%n", "Year", "Estimated Population", "Change from Prior Year");

        // Loop to calculate population for the next 75 years
        for (int year = 1; year <= 75; year++) {
            // Calculate the change in population
            double populationIncrease = currentPopulation * growthRate;
            // Calculate the new population
            double newPopulation = currentPopulation + populationIncrease;

            // Print the year, estimated population, and population change
            System.out.printf("%-5d %-20.0f %-20.0f%n", year, newPopulation, populationIncrease);

            // Update current population for the next year
            currentPopulation = newPopulation;
        }

        input.close();
    }
}