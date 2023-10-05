package code_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class b_Part2 {
    public static void main(String[] args) {
        // Define the size of the collection
        int collectionSize = 1000000; // Adjust this size as needed

        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();

        // Create a Vector
        Vector<Integer> vector = new Vector<>();

        // Create an array
        int[] array = new int[collectionSize];

        // Initialize a random number generator
        Random random = new Random();

        // Populate the collections with random integers
        for (int i = 0; i < collectionSize; i++) {
            int value = random.nextInt(10);
            arrayList.add(value);
            vector.add(value);
            array[i] = value;
        }

        // Measure the time taken for iteration using iterators (ArrayList and Vector)
        long startTime, endTime;
        double arrayListIterationTime, vectorIterationTime;
        int repetitions = 10; // Number of repetitions for stable timings

        // ArrayList Iteration
        arrayListIterationTime = 0;
        for (int i = 0; i < repetitions; i++) {
            startTime = System.nanoTime();
            Iterator<Integer> arrayListIterator = arrayList.iterator();
            int sum = 0;
            while (arrayListIterator.hasNext()) {
                sum += arrayListIterator.next();
            }
            endTime = System.nanoTime();
            arrayListIterationTime += (endTime - startTime) / 1e6; // Convert to milliseconds
        }
        arrayListIterationTime /= repetitions;

        // Vector Iteration
        vectorIterationTime = 0;
        for (int i = 0; i < repetitions; i++) {
            startTime = System.nanoTime();
            Iterator<Integer> vectorIterator = vector.iterator();
            int sum = 0;
            while (vectorIterator.hasNext()) {
                sum += vectorIterator.next();
            }
            endTime = System.nanoTime();
            vectorIterationTime += (endTime - startTime) / 1e6; // Convert to milliseconds
        }
        vectorIterationTime /= repetitions;

        // Measure the time taken for iteration using a for loop (Array)
        double arrayIterationTime = 0;
        for (int i = 0; i < repetitions; i++) {
            startTime = System.nanoTime();
            int sum = 0;
            for (int j = 0; j < collectionSize; j++) {
                sum += array[j];
            }
            endTime = System.nanoTime();
            arrayIterationTime += (endTime - startTime) / 1e6; // Convert to milliseconds
        }
        arrayIterationTime /= repetitions;

        // Present data in a table
        System.out.println("Performance Comparison (Time in ms)");
        System.out.println("-------------------------------------------------");
        System.out.println("| Collection Type   | Iteration Time (Avg) |");
        System.out.println("-------------------------------------------------");
        System.out.printf("| ArrayList          | %.2f                   |\n", arrayListIterationTime);
        System.out.printf("| Vector             | %.2f                   |\n", vectorIterationTime);
        System.out.printf("| Array              | %.2f                   |\n", arrayIterationTime);
        System.out.println("-------------------------------------------------");

        // Draw conclusions and recommendations
        System.out.println("\nConclusions:");
        System.out.println("1. ArrayList and Vector have similar iteration performance.");
        System.out.println("2. Using a for loop to iterate over an array is the fastest method.");
        System.out.println(
                "3. Designers should choose the appropriate data structure based on their specific use case and requirements.");

    }
}
