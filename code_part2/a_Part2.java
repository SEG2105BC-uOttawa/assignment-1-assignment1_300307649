package code_part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class a_Part2 {
    public static void main(String[] args) {
        // Define the size of the collection
        int collectionSize = 100000000; // Adjust this size to achieve a runtime of at least 10 seconds for ArrayList

        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Create a Vector
        Vector<Integer> vector = new Vector<>();

        // Create an array
        int[] array = new int[collectionSize];

        // Initialize a random number generator
        Random random = new Random();

        // Initialize variables for timing
        long startTime, endTime;
        double arrayListTime = 0, vectorTime = 0, arrayTime = 0;
        int repetitions = 10; // Number of repetitions for stable timings

        // Experiment loop
        for (int i = 0; i < repetitions; i++) {
            // ArrayList
            startTime = System.nanoTime();
            for (int j = 0; j < collectionSize; j++) {
                arrayList.add(random.nextInt(10));
            }
            endTime = System.nanoTime();
            arrayListTime += (endTime - startTime) / 1e6; // Convert to milliseconds

            // Vector
            startTime = System.nanoTime();
            for (int j = 0; j < collectionSize; j++) {
                vector.add(random.nextInt(10));
            }
            endTime = System.nanoTime();
            vectorTime += (endTime - startTime) / 1e6; // Convert to milliseconds

            // Array
            startTime = System.nanoTime();
            for (int j = 0; j < collectionSize; j++) {
                array[j] = random.nextInt(10);
            }
            endTime = System.nanoTime();
            arrayTime += (endTime - startTime) / 1e6; // Convert to milliseconds

            // Clear collections for the next run
            arrayList.clear();
            vector.clear();
        }

        // Calculate average execution times
        arrayListTime /= repetitions;
        vectorTime /= repetitions;
        arrayTime /= repetitions;

        // Print results
        System.out.println("Average Time to Add " + collectionSize + " Random Integers:");
        System.out.println("ArrayList: " + arrayListTime + " ms");
        System.out.println("Vector: " + vectorTime + " ms");
        System.out.println("Array: " + arrayTime + " ms");
    }
}
